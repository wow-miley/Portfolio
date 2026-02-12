package codes.miley.frontend.widget

import codes.miley.frontend.markdown
import codes.miley.frontend.store.BlogStore
import codes.miley.model.BlogPost
import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.blogPostView() {
    div("blog-page") {
        main {
            BlogStore.data
                .map { state -> state.posts.find { it.id == state.selectedPostId } }
                .distinctUntilChanged()
                .render { post ->
                    if (post != null) {
                        articleContent(post)
                    }
                }
        }
    }
}

private fun RenderContext.articleContent(post: BlogPost) {
    article {
        header("article-header") {
            div("article-date") { +post.date }
            h1 { +post.title }
            p("article-subtitle") { +post.subtitle }
        }

        markdown(post.content)

        div("article-cta") {
            p {
                a {
                    href("https://github.com/socket-link/ampere")
                    +"AMPERE"
                }
                +" is an open-source cognitive engine built in Kotlin Multiplatform where AI reasoning is transparent by design. It's early, it's opinionated, and it's available now."
            }
        }
    }
}
