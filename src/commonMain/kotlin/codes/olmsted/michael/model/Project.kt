package codes.olmsted.michael.model

import dev.fritz2.lenses.Lenses

@Lenses
data class Project(
    val id: Long,
    val name: String,
    val route: String,
    val category: Category,
    val skills: Set<Skill>,
    val topics: Set<Topic>,
)

val STUB_PROJECTS: List<Project> = listOf(
    Project(
        id = 123,
        name = "StockX",
        route = "/stockx",
        category = Category.JOB,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 1234,
        name = "Trove",
        route = "/trove",
        category = Category.JOB,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 77,
        name = "LineLeap",
        route = "/lineleap",
        category = Category.FREELANCE,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 12345,
        name = "handotate",
        route = "/handotate",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 12345,
        name = "Meet^",
        route = "/meetup",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 12345,
        name = "TaskTracker",
        route = "/tasktracker",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        )
    ),
    Project(
        id = 12345,
        name = "Totem",
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
