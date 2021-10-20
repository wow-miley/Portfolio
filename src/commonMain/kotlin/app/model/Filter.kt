package app.model

data class FilterConfig(
    val selectedCategory: Category?,
    val selectedSkills: Set<Skill>?,
    val selectedTopics: Set<Topic>?,
)

fun List<Project>.filterBy(filterConfig: FilterConfig?): List<Project> =
    filter { project ->
        filterConfig?.let { config ->
            val categoryCheck = config.selectedCategory?.let { project.category == it } ?: true

            val skillsCheck = config.selectedSkills?.let { skills ->
                skills.any { project.skills.contains(it) }
            } ?: true

            val topicsCheck = config.selectedTopics?.let { topics ->
                topics.any { project.topics.contains(it) }
            } ?: true

            categoryCheck && skillsCheck && topicsCheck
        } ?: true
    }
