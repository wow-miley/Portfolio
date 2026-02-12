package codes.miley.frontend.widget

import codes.miley.model.Experience
import dev.fritz2.core.RenderContext
import dev.fritz2.core.src

private val Experience.dateRanges: List<String>
    get() = timespans.map { (startYear, endYear) ->
        when {
            endYear == null -> "$startYear - Now"
            startYear == endYear -> "$startYear"
            else -> "$startYear - $endYear"
        }
    }

private val Experience.isActive: String
    get() = when (timespans.lastOrNull()?.second) {
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
                        div("title-description") {
                            div("experience-header title-row") {
                                h1("experience-header title") { +name }
                                dateRanges.forEach { range ->
                                    h6("date-range $isActive") { +range }
                                }
                            }
                            h5 { +title }
                        }
                    }
                }

                div("tags ${category.name.lowercase()}") {
                    h6 {
                        span {
                            +category.displayName
                        }
                    }
                    skills.forEach { skill ->
                        div("skill") {
                            h6 { 
                                span {
                                    +skill.displayName
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
