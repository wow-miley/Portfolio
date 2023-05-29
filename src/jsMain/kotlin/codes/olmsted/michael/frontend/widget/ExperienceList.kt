package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.frontend.store.ExperienceStore
import codes.olmsted.michael.model.filterBy
import dev.fritz2.core.RenderContext
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.experienceList() {
    div("experience-section") {
        h1 { +"All Experiences" }
        ExperienceStore.data
            .map { state ->
                state.experiences.filterBy(state.filterConfig)
            }
            .distinctUntilChanged()
            .render { experiences ->
                div("experience-list Grid Grid--gutters large-Grid--1of4 medium-Grid--1of3 small-Grid--full") {
                    experiences.forEach { experience ->
                        experienceCell(experience)
                    }
                }
            }
    }
}
