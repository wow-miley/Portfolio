package codes.olmsted.michael.model

import dev.fritz2.core.Lenses

@Lenses
data class Experience(
    val id: Long,
    val startYear: Int,
    val endYear: Int?,
    val name: String,
    val title: String,
    val route: String,
    val summary: String,
    val category: Category,
    val skills: Set<Skill>,
    val topics: Set<Topic>,
    val iconUri: String,
    val media: List<Media>,
) {
    companion object
}

val WALMART = Experience(
    id = 123,
    startYear = 2019,
    endYear = null,
    name = "Walmart",
    title = "Senior Mobile Solutions Engineer",
    route = "/walmart",
    summary = "- Member of Android Platform team, designing Gradle build tools to increase developer productivity - Member of Walmart+ Member Care team, building features .",
    category = Category.JOB,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.GRAPHQL,
    ),
    topics = setOf(
        Topic.E_COMMERCE,
        Topic.UI,
    ),
    iconUri = "/experiences/job/stockx/icon.jpeg",
    media = listOf(
        Media.Gif(
            uri = "/job/stockx/load_regions_thumb.png",
            gifUri = "/job/stockx/load_regions.gif",
        ),
        Media.Gif(
            uri = "/job/stockx/sales_graph_thumb.png",
            gifUri = "/job/stockx/sales_graph.gif",
        ),
        Media.Gif(
            uri = "/job/stockx/product_transition_thumb.png",
            gifUri = "/job/stockx/product_transition.gif",
        ),
    ),
)

val SOCKET = Experience(
    id = 12345,
    startYear = 2021,
    endYear = null,
    name = "Socket",
    title = "Kotlin Multiplatform",
    route = "/socket",
    summary = "Built a native Android app using Jetpack Compose, Coroutines, Flow, Hilt, Room, and GraphQL. Delivered a minimum viable direct-to-consumer product for the world's leading ed-tech company.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.JAVA,
        Skill.GRAPHQL,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/freelance/ateam/icon.svg",
    media = listOf(
        Media.Image("/freelance/ateam/nda.png"),
    ),
)

val STOCK_X = Experience(
    id = 123,
    startYear = 2019,
    endYear = 2022,
    name = "StockX",
    title = "Android Software Engineer II",
    route = "/stockx",
    summary = "Developing a native Android application in Kotlin using Jetpack Compose, MVVM, Coroutines, Flow, and Clean Architecture. Working in a legacy Java codebase and introducing new features in Kotlin. Involved in checkout, payment, and internationalization feature work.",
    category = Category.JOB,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.JAVA,
        Skill.GRAPHQL,
    ),
    topics = setOf(
        Topic.E_COMMERCE,
        Topic.UI,
    ),
    iconUri = "/experiences/job/stockx/icon.jpeg",
    media = listOf(
        Media.Gif(
            uri = "/job/stockx/load_regions_thumb.png",
            gifUri = "/job/stockx/load_regions.gif",
        ),
        Media.Gif(
            uri = "/job/stockx/sales_graph_thumb.png",
            gifUri = "/job/stockx/sales_graph.gif",
        ),
        Media.Gif(
            uri = "/job/stockx/product_transition_thumb.png",
            gifUri = "/job/stockx/product_transition.gif",
        ),
    ),
)

val SHARPEN = Experience(
    id = 12345,
    startYear = 2021,
    endYear = 2022,
    name = "Sharpen",
    title = "Android Developer",
    route = "/sharpen",
    summary = "Built a native Android app using Jetpack Compose, Coroutines, Flow, Hilt, Room, and GraphQL. Delivered a minimum viable direct-to-consumer product for the world's leading ed-tech company.",
    category = Category.FREELANCE,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.JAVA,
        Skill.GRAPHQL,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
        Topic.ED_TECH,
    ),
    iconUri = "/experiences/freelance/ateam/icon.svg",
    media = listOf(
        Media.Image("/freelance/ateam/nda.png"),
    ),
)

val TROVE = Experience(
    id = 1234,
    startYear = 2018,
    endYear = 2019,
    name = "Trove",
    title = "Android Engineering Intern",
    route = "/trove",
    summary = "Developed a native Android application in Kotlin using RxJava with a Redux architecture. Focused on UI/UX implementation of features including reusable components, animations, and development of a platform style guide.",
    category = Category.JOB,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.JAVA,
    ),
    topics = setOf(
        Topic.CHAT,
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/job/trove/icon.jpeg",
    media = listOf(
        Media.Gif(
            uri = "/job/trove/login_thumb.png",
            gifUri = "/job/trove/login.gif",
        ),
        Media.Gif(
            uri = "/job/trove/post_thumb.png",
            gifUri = "/job/trove/post.gif"
        ),
        Media.Gif(
            uri = "/job/trove/search_thumb.png",
            gifUri = "/job/trove/search.gif"
        ),
        Media.Image("/job/trove/chat.png"),
    ),
)

val HANDOTATE = Experience(
    id = 12345,
    startYear = 2019,
    endYear = 2019,
    name = "handotate",
    title = "Native Android & Design",
    route = "/handotate",
    summary = "Used mvRx library from AirBnb to facilitate rapid iteration, created custom UI for annotating ML training datasets.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.SQL,
        Skill.AWS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/handotate/icon.png",
    media = listOf(
        Media.Image("/project/handotate/home.png"),
        Media.Image("/project/handotate/find.png"),
        Media.Image("/project/handotate/account.png"),
    ),
)

val MEET_UP = Experience(
    id = 12345,
    startYear = 2019,
    endYear = 2019,
    name = "Meet^",
    title = "React Native & Design",
    route = "/meet_up",
    summary = "Used React Native and Firebase to build a realtime chat app for making spontaneous plans with friends.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.REACT_NATIVE,
        Skill.FIREBASE,
        Skill.JAVASCRIPT,
        Skill.NODEJS,
    ),
    topics = setOf(
        Topic.CHAT,
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/meet_up/icon.png",
    media = listOf(
        Media.Image("/project/meet_up/events.png"),
        Media.Image("/project/meet_up/groups.png"),
        Media.Image("/project/meet_up/chat.png"),
    ),
)

val LINELEAP = Experience(
    id = 77,
    startYear = 2018,
    endYear = 2018,
    name = "LineLeap",
    title = "React Web & Design",
    route = "/lineleap",
    summary = "Integrated with Squarespace orders API to allow event staff to validate a user's digital ticket purchase.",
    category = Category.FREELANCE,
    skills = setOf(
        Skill.REACT,
        Skill.JAVASCRIPT,
        Skill.AWS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/freelance/lineleap/icon.png",
    media = listOf(
        Media.Image("/freelance/lineleap/loading.png"),
        Media.Image("/freelance/lineleap/confirmed.png"),
        Media.Image("/freelance/lineleap/denied.png"),
    ),
)

val TASKTRACKER = Experience(
    id = 12345,
    startYear = 2018,
    endYear = 2018,
    name = "TaskTracker",
    title = "React Web & Design",
    route = "/task_tracker",
    summary = "Focused on the product design of a Kanban style homework tracking web app. Built out the proper infrastructure to allow for user testing to validate MVP.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.REACT,
        Skill.JAVASCRIPT,
        Skill.AWS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/task_tracker/icon.png",
    media = listOf(
        Media.Image("/project/task_tracker/classes.png"),
        Media.Image("/project/task_tracker/class.png"),
        Media.Image("/project/task_tracker/assignments.png"),
    ),
)

val TOTEM = Experience(
    id = 12345,
    startYear = 2017,
    endYear = 2018,
    name = "Totem",
    title = "Native Android & Design",
    route = "/totem",
    summary = "Developed a native Android application in Kotlin using RxJava and Dagger. Also responsible for the UI design, API design, and overall technology management of the company.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.ANDROID,
        Skill.KOTLIN,
        Skill.AWS,
        Skill.FIREBASE,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/totem/icon.png",
    media = listOf(
        Media.Image("/project/totem/private_feed.png"),
        Media.Image("/project/totem/public_feed.png"),
        Media.Image("/project/totem/refactor.png"),
    ),
)

val PRESENT = Experience(
    id = 12345,
    startYear = 2017,
    endYear = 2017,
    name = "Present VR",
    title = "Unity & node.js",
    route = "/present",
    summary = "Created an SDK for Unity to allow for dynamic insertion of gamified ad experiences within any given VR experience.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.UNITY,
        Skill.NODEJS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/present/icon.png",
    media = listOf(
        Media.Image("/project/present/user_test.png"),
        Media.Image("/project/present/pitch.jpg"),
        Media.Image("/project/present/presentation.jpg"),
    ),
)

val ARTABLETOP = Experience(
    id = 12345,
    startYear = 2017,
    endYear = 2017,
    name = "ARTabletop",
    title = "Unity & Android ARCore",
    route = "/artabletop",
    summary = "Built the backend to allow for realtime remote D&D gameplay through a shared interactive AR game board.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.UNITY,
        Skill.ARCORE,
        Skill.NODEJS,
        Skill.AWS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/artabletop/icon.png",
    media = listOf(
        Media.Image("/project/artabletop/move_range.jpg"),
        Media.Image("/project/artabletop/tabletop.jpg"),
        Media.Image("/project/artabletop/up_close.jpg"),
    ),
)

val MFRAME = Experience(
    id = 12345,
    startYear = 2016,
    endYear = 2017,
    name = "mFrame",
    title = "A-Frame WebVR",
    route = "/mframe",
    summary = "Built the backend for a web-based VR social network, where users could customize a virtual space to express themselves.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.HTML,
        Skill.NODEJS,
        Skill.AWS,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/mframe/icon.png",
    media = listOf(
        Media.Image("/project/mframe/vaporwave.png"),
        Media.Image("/project/mframe/vr.png"),
        Media.Image("/project/mframe/web.png"),
    ),
)

val GBHS = Experience(
    id = 12345,
    startYear = 2015,
    endYear = 2016,
    name = "GBHS",
    title = "Native Android & iOS",
    route = "/gbhs",
    summary = "Commissioned by the school to build a self-serve school resource app that scraped data from the official website.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.ANDROID,
        Skill.JAVA,
        Skill.IOS,
        Skill.OBJECTIVE_C,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/gbhs/icon.png",
    media = listOf(
        Media.Image("/project/gbhs/drawer.png"),
        Media.Image("/project/gbhs/schedule.png"),
        Media.Image("/project/gbhs/calendar.png"),
    ),
)

val ALL_EXPERIENCES = listOf(
    WALMART,
    SOCKET,
    STOCK_X,
    SHARPEN,
    TROVE,
    HANDOTATE,
    MEET_UP,
    LINELEAP,
    TASKTRACKER,
    TOTEM,
    PRESENT,
    ARTABLETOP,
    MFRAME,
    GBHS,
)

val FEATURED_EXPERIENCES = listOf(
    WALMART,
    STOCK_X,
    SHARPEN,
)
