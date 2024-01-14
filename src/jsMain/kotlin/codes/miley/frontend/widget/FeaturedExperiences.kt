package codes.miley.frontend.widget

import codes.miley.model.FEATURED_EXPERIENCES
import dev.fritz2.core.RenderContext

fun RenderContext.featuredExperiences() {
    div("experience-section") {
        h1 { +"Featured Experiences" }
        div("experience-list Grid Grid--gutters large-Grid--1of3 medium-Grid--1of2 small-Grid--full") {
            FEATURED_EXPERIENCES.forEach { experience ->
                experienceCell(experience)
            }
        }
    }
}
