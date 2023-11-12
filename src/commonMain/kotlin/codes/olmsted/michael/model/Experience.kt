package codes.olmsted.michael.model

import dev.fritz2.core.Lenses

@Lenses
data class Experience(
    val id: Long,
    val timespans: List<Pair<Int, Int?>>,
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
    timespans = listOf(2022 to null),
    name = "Walmart",
    title = "Senior Mobile Solutions Engineer",
    route = "/walmart",
    summary = "Member of the Android Platform team; designing Gradle build tools to increase developer productivity and ensure tech debt is properly managed. Member of Walmart+ Member Care team; building features to enhance the account management experience.",
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
    iconUri = "/experiences/job/walmart/icon.png",
    media = listOf(
        Media.Image(
            uri = "/job/walmart/home.png",
        ),
        Media.Image(
            uri = "/job/walmart/account.png",
        ),
        Media.Image(
            uri = "/job/walmart/w_plus.png",
        ),
    ),
)

val SOCKET = Experience(
    id = 12345,
    timespans = listOf(2021 to null),
    name = "Socket",
    title = "Kotlin Multiplatform",
    route = "/socket",
    summary = "Building a cross-platform automation platform to allow for extensible control of any device. Creating native Android, iOS, Web, and Desktop clients while leveraging Kotlin Multiplatform, Compose, and SwiftUI for true \"write once, run everywhere\" feature development.",
    category = Category.PROJECT,
    skills = setOf(
        Skill.COMPOSE,
        Skill.KOTLIN_MULTIPLATFORM,
        Skill.GRAPHQL,
        Skill.SWIFT_UI,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
    ),
    iconUri = "/experiences/project/socket/icon.png",
    media = listOf(
        Media.Image(
            uri = "/project/socket/notification.png",
        ),
        Media.Image(
            uri = "/project/socket/table_form.png",
        ),
        Media.Image(
            uri = "/project/socket/table_render.png",
        ),
    ),
)

val STOCK_X = Experience(
    id = 123,
    timespans = listOf(2019 to 2022),
    name = "StockX",
    title = "Android Software Engineer II",
    route = "/stockx",
    summary = "Worked in a legacy Java codebase to migrate features into Kotlin using Clean Architecture. Involved in checkout, payment, and internationalization feature work. Responsible for the initial adoption of Jetpack Compose while performing a complete rewrite of the checkout flow.",
    category = Category.JOB,
    skills = setOf(
        Skill.ANDROID,
        Skill.COMPOSE,
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
    timespans = listOf(2021 to 2022, 2023 to 2023),
    name = "Sharpen",
    title = "Android Developer",
    route = "/sharpen",
    summary = "Architected a native Android app using Jetpack Compose, Coroutines, MVU, and GraphQL. Delivered a minimum viable direct-to-consumer product for the McGraw Hill -- the world's leading ed-tech company. Rejoined the project in 2023 to work on a cross-platform analytics library implementation for launching v2.",
    category = Category.FREELANCE,
    skills = setOf(
        Skill.ANDROID,
        Skill.COMPOSE,
        Skill.KOTLIN,
        Skill.KOTLIN_MULTIPLATFORM,
        Skill.GRAPHQL,
    ),
    topics = setOf(
        Topic.UI,
        Topic.UX,
        Topic.ED_TECH,
    ),
    iconUri = "/experiences/freelance/sharpen/icon.png",
    media = listOf(
        Media.Gif(
            uri = "/freelance/sharpen/swiping_thumb.jpg",
            gifUri = "/freelance/sharpen/swiping.gif",
        ),
        Media.Gif(
            uri = "/freelance/sharpen/quiz_thumb.jpg",
            gifUri = "/freelance/sharpen/quiz.gif",
        ),
        Media.Image(
            uri = "/freelance/sharpen/track.png",
        ),
    ),
)

val TROVE = Experience(
    id = 1234,
    timespans = listOf(2018 to 2019),
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
    timespans = listOf(2019 to 2019),
    name = "handotate",
    title = "Native Android & Design",
    route = "/handotate",
    summary = "Used the mvRx library from AirBnb to facilitate rapid iteration of a prototype used for annotating ML training datasets. Included the ability to keyframe multiple bounding boxes on videos, and then interpolate for labelling a moving object.",
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
        Media.Gif(
            uri = "/project/handotate/handotate_thumb.jpg",
            gifUri = "/project/handotate/handotate.gif",
        ),
        Media.Image("/project/handotate/home.png"),
        Media.Image("/project/handotate/account.png"),
    ),
)

val MEET_UP = Experience(
    id = 12345,
    timespans = listOf(2019 to 2019),
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
    timespans = listOf(2018 to 2018),
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
    timespans = listOf(2018 to 2018),
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
    timespans = listOf(2017 to 2018),
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
    timespans = listOf(2017 to 2017),
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
    timespans = listOf(2017 to 2017),
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
    timespans = listOf(2016 to 2017),
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
    timespans = listOf(2015 to 2016),
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
    SHARPEN,
    STOCK_X,
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
