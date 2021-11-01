package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.frontend.store.ExperienceStore
import codes.olmsted.michael.model.filterBy
import dev.fritz2.dom.html.RenderContext
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.experienceList() {
    section("experience-list") {
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
