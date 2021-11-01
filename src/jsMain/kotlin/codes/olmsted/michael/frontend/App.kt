package codes.olmsted.michael.frontend

import codes.olmsted.michael.frontend.store.ExperienceStore
import codes.olmsted.michael.frontend.widget.experienceList
import codes.olmsted.michael.model.Category
import dev.fritz2.dom.html.RenderContext
import dev.fritz2.dom.html.render
import dev.fritz2.routing.Router
import dev.fritz2.routing.router
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*

fun RenderContext.header(
    router: Router<Map<String, String>>,
) {
    section("categories") {
        h2 { +"Michael Olmsted" }
        h4 { +"Software Engineer" }

        nav {
            ul {
                Category
                    .values()
                    .map { it.route }
                    .forEach { route ->
                        li {
                            a {
                                +route

                                ExperienceStore.data
                                    .map { it.filterConfig?.selectedCategory }
                                    .distinctUntilChanged()
                                    .render { category ->
                                        className(
                                            if (category?.route == route) "selected" else ""
                                        )
                                    }

                                clicks.map {
                                    mapOf(
                                        "category" to route
                                    )
                                } handledBy router.navTo
                            }
                        }
                    }
            }
        }
    }
}

@ExperimentalCoroutinesApi
fun main() {
    val router = router(mapOf("category" to "all"))

    render("#target") {
        router
            .data
            .distinctUntilChanged()
            .render {
                it["category"]
                    ?.let(Category::valueOf)
                    ?.let { category ->
                        ExperienceStore.setSelectedCategory(category)
                    }
            }

        div("content") {
            header(router)
            experienceList()
        }
    }
}
