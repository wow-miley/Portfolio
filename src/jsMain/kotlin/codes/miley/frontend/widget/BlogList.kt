package codes.miley.frontend.widget

import codes.miley.frontend.store.BlogStore
import dev.fritz2.core.RenderContext
import dev.fritz2.routing.Router
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.blogList(router: Router<Map<String, String>>) {
    div("blog-page") {
        main {
            section("blog-hero") {
                h1 { +"Blog" }
                p("subtitle") {
                    +"My thoughts on observable AI cognition, agentic management architecture, and building responsible software that operates transparently."
                }
            }

            ul("post-list") {
                BlogStore.data
                    .map { it.posts }
                    .distinctUntilChanged()
                    .render { posts ->
                        posts.forEach { post ->
                            li("post-item") {
                                a {
                                    clicks.map {
                                        mapOf("page" to "blog", "post" to post.id)
                                    } handledBy router.navTo

                                    div("post-date") { +post.date }
                                    div("post-title") { +post.title }
                                    div("post-subtitle") { +post.subtitle }
                                    p("post-excerpt") { +post.excerpt }
                                }
                            }
                        }
                    }
            }
        }
    }
}
