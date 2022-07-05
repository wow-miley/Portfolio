package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.frontend.store.ExperienceStore
import codes.olmsted.michael.model.filterBy
import dev.fritz2.dom.html.RenderContext
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.experienceList() {
    div("experience-list Grid Grid--full small-Grid--full large-Grid--1of2") {
        ExperienceStore.data
            .map {  state ->
                state.experiences.filterBy(state.filterConfig)
            }
            .distinctUntilChanged()
            .render { experiences ->
                experiences.forEach { experience ->
                    experienceTile(experience)
                }
            }
    }
}
