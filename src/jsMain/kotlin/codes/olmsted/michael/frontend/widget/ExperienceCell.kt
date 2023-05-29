package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Experience
import dev.fritz2.core.RenderContext
import dev.fritz2.core.src

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

fun RenderContext.experienceCell(
    experience: Experience,
) {
    with(experience) {
        div("experience-cell Grid-cell") {
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
                    experienceGallery(media)
                }

                p("experience-info") { +summary }
            }
        }
    }
}
