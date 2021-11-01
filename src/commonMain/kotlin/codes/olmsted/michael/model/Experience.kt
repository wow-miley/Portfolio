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
    val imageUris: List<String>,
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
        ),
        imageUris = listOf(
            "/job/stockx/load_regions.gif",
            "/job/stockx/sales_graph.gif",
            "/job/stockx/product_transition.gif",
        ),
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
        ),
        imageUris = listOf(
            "/job/trove/login.gif",
            "/job/trove/post.gif",
            "/job/trove/search.gif",
            "/job/trove/chat.png",
        ),
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
        ),
        imageUris = listOf(
            "/freelance/lineleap/loading.png",
            "/freelance/lineleap/confirmed.png",
            "/freelance/lineleap/denied.png",
        ),
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
        ),
        imageUris = listOf(
            "/project/handotate/home.png",
            "/project/handotate/find.png",
            "/project/handotate/account.png",
        ),
    ),
    Experience(
        id = 12345,
        name = "Meet^",
        title = "Android Software Engineer II",
        route = "/meet_up",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        ),
        imageUris = listOf(
            "/project/meet_up/events.png",
            "/project/meet_up/groups.png",
            "/project/meet_up/chat.png",
        ),
    ),
    Experience(
        id = 12345,
        name = "TaskTracker",
        title = "Android Software Engineer II",
        route = "/task_tracker",
        category = Category.PROJECT,
        skills = setOf(
            Skill.ANDROID,
        ),
        topics = setOf(
            Topic.E_COMMERCE,
        ),
        imageUris = listOf(
            "/project/task_tracker/classes.png",
            "/project/task_tracker/class.png",
            "/project/task_tracker/assignments.png",
        ),
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
        ),
        imageUris = listOf(
            "/project/totem/private_feed.png",
            "/project/totem/public_feed.png",
            "/project/totem/refactor.png",
        ),
    ),
)
