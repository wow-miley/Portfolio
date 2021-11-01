package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Experience
import dev.fritz2.dom.html.RenderContext

fun RenderContext.experienceTile(
    experience: Experience,
) {
    with(experience) {
        div("experience-tile col") {
            div("experience-header row") {
                img("experience-icon") {
                    src(iconUri)
                }

                div("experience-header col") {
                    h1 { +name }
                    h5 { +title }

                    div("tags ${category.name.lowercase()}") {
                        h6 { +category.displayName }

                        skills.forEach { skill ->
                            div("skill") {
                                h6 { +skill.displayName }
                            }
                        }
                    }
                }
            }

            div("divider") {}

            experienceImages(imageUris)

            p { +summary }
        }
    }
}
