package codes.olmsted.michael.model

import dev.fritz2.lenses.Lenses

@Lenses
data class Experience(
    val id: Long,
    val name: String,
    val title: String,
    val route: String,
    val category: Category,
    val skills: Set<Skill>,
    val topics: Set<Topic>,
)

val STUB_EXPERIENCES: List<Experience> = listOf(
    Experience(
        id = 123,
        name = "StockX",
        title = "Android Software Engineer II",
        route = "/stockx",
        category = Category.JOB,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 1234,
        name = "Trove",
        title = "Android Software Engineer II",
        route = "/trove",
        category = Category.JOB,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 77,
        name = "LineLeap",
        title = "Android Software Engineer II",
        route = "/lineleap",
        category = Category.FREELANCE,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 12345,
        name = "handotate",
        title = "Android Software Engineer II",
        route = "/handotate",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 12345,
        name = "Meet^",
        title = "Android Software Engineer II",
        route = "/meetup",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 12345,
        name = "TaskTracker",
        title = "Android Software Engineer II",
        route = "/tasktracker",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Experience(
        id = 12345,
        name = "Totem",
        title = "Android Software Engineer II",
        route = "/totem",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
)
