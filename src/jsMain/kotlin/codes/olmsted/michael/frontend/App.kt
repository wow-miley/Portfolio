package codes.olmsted.michael.frontend

import codes.olmsted.michael.frontend.store.ExperienceStore
import codes.olmsted.michael.frontend.widget.experienceList
import codes.olmsted.michael.model.Category
import dev.fritz2.core.RenderContext
import dev.fritz2.core.render
import dev.fritz2.routing.Router
import dev.fritz2.routing.routerOf
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*

fun RenderContext.header(
    router: Router<Map<String, String>>,
) {
    div("categories") {
        h2 { +"Michael Olmsted" }
        h4 { +"Native Android Application Engineer" }

        // TODO: Add filtering
        // nav {
        //     ul {
        //         Category
        //             .values()
        //             .map { it.displayName }
        //             .forEach { route ->
        //                 li {
        //                     a {
        //                         +route
        //
        //                         ExperienceStore.data
        //                             .map { it.filterConfig?.selectedCategory }
        //                             .distinctUntilChanged()
        //                             .render { category ->
        //                                 className(
        //                                     if (category?.displayName == route) "selected" else ""
        //                                 )
        //                             }
        //
        //                         clicks.map {
        //                             mapOf(
        //                                 "category" to route
        //                             )
        //                         } handledBy router.navTo
        //                     }
        //                 }
        //             }
        //     }
        // }
    }
}

@ExperimentalCoroutinesApi
fun main() {
    val router = routerOf(mapOf("category" to "all"))

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
