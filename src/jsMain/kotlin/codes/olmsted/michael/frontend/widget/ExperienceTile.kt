package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Experience
import dev.fritz2.dom.html.RenderContext

private val Experience.dateRange: String
get() = when {
    endYear == null -> "$startYear - Now"
    startYear == endYear -> "$startYear"
    else -> "$startYear - $endYear"
}

private val Experience.isActive: String
get() = when (endYear) {
    null -> "active"
    else -> ""
}

fun RenderContext.experienceTile(
    experience: Experience,
) {
    with(experience) {
        div("experience-tile Grid-cell") {
            div("experience-content") {
                div("experience-header row") {
                    img("experience-icon") {
                        src(iconUri)
                    }

                    div("experience-header col") {
                        div("experience-header title-row") {
                            h1 { +name }
                            h6("date-range $isActive") { +dateRange }
                        }

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

                div("experience-gallery") {
                    experienceImages(imageUris)
                }

                p("experience-info") { +summary }
            }
        }
    }
}
