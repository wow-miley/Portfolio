package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Experience
import dev.fritz2.dom.html.RenderContext

fun RenderContext.experienceTile(
    experience: Experience,
) {
    with(experience) {
        div("experience-tile col") {
            div("experience-header row") {
                img {
                }

                div("experience-header col") {
                    h1 { +name }
                    h5 { +title }

                    div("tags") {
                        h6 { +category.name }
                    }
                }
            }

            experienceImages(imageUris)

            p { +"developing a international blah blah" }
        }
    }
}
