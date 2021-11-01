package codes.olmsted.michael.model

import dev.fritz2.lenses.Lenses

@Lenses
data class Experience(
    val id: Long,
    val name: String,
    val title: String,
    val route: String,
    val summary: String,
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
        summary = "Developing a native Android application in Kotlin using MVVM, Coroutines, Flow, and Clean Architecture. Working in a legacy Java codebase and introducing new features in Kotlin. Involved in checkout, payment, and internationalization feature work.",
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
        summary = "Developed a native Android application in Kotlin using RxJava with a Redux architecture. Focused on UI/UX implementation of features including reusable components, animations, and development of a platform style guide.",
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
        summary = "",
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
        summary = "",
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
        summary = "",
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
        summary = "",
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
        summary = "Developed a native Android application in Kotlin using RxJava and Dagger. Also responsible for the UI design, API design, and overall technology management of the company.",
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
