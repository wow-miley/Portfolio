package codes.miley.frontend

import codes.miley.frontend.store.BlogStore
import codes.miley.model.ALL_POSTS
import codes.miley.frontend.store.ExperienceStore
import codes.miley.frontend.widget.blogList
import codes.miley.frontend.widget.blogPostView
import codes.miley.frontend.widget.experienceList
import codes.miley.frontend.widget.featuredExperiences
import codes.miley.model.Category
import dev.fritz2.core.RenderContext
import dev.fritz2.core.render
import dev.fritz2.routing.Router
import dev.fritz2.routing.routerOf
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import org.w3c.dom.HTMLMetaElement

private fun setMetaTag(attrName: String, attrValue: String, content: String) {
    val selector = "meta[$attrName=\"$attrValue\"]"
    val element = document.querySelector(selector) as? HTMLMetaElement
    if (element != null) {
        element.content = content
    }
}

private fun updateMetaTags(title: String, description: String, url: String, image: String) {
    setMetaTag("property", "og:title", title)
    setMetaTag("property", "og:description", description)
    setMetaTag("property", "og:url", url)
    setMetaTag("property", "og:image", image)
    setMetaTag("name", "twitter:title", title)
    setMetaTag("name", "twitter:description", description)
    setMetaTag("name", "twitter:image", image)
}

private fun trackPageView(route: Map<String, String>) {
    val path = when {
        route["page"] == "blog" && route.containsKey("post") -> "/blog/${route["post"]}"
        route["page"] == "blog" -> "/blog"
        else -> "/"
    }
    val gtag = window.asDynamic().gtag
    if (gtag != null) {
        val params = js("{}")
        params.page_path = path
        gtag("event", "page_view", params)
    }
}

fun RenderContext.header() {
    var lastScrollY = window.scrollY
    div("categories") {
        window.addEventListener("scroll", {
            val currentScrollY = window.scrollY
            if (currentScrollY > lastScrollY && currentScrollY > 100) {
                domNode.classList.add("hidden")
            } else {
                domNode.classList.remove("hidden")
            }
            lastScrollY = currentScrollY
        })
        h2 { +"Miley Chandonnet" }
        h4 { +"Native Android Application Engineer" }
    }
}

fun RenderContext.pageNav(
    router: Router<Map<String, String>>,
) {
    nav("page-nav") {
        ul {
            li {
                a {
                    className(router.data.map { route ->
                        if (route["page"] == null) "selected" else ""
                    }.distinctUntilChanged())
                    +"Home"
                    clicks.map {
                        mapOf("category" to "all")
                    } handledBy router.navTo
                }
            }
            li {
                a {
                    className(router.data.map { route ->
                        if (route["page"] == "blog") "selected" else ""
                    }.distinctUntilChanged())
                    +"Blog"
                    clicks.map {
                        mapOf("page" to "blog")
                    } handledBy router.navTo
                }
            }
        }
    }
}

@ExperimentalCoroutinesApi
fun main() {
    val router = routerOf(mapOf("category" to "all"))

    render("#target") {
        router
            .data
            .distinctUntilChanged()
            .render { route ->
                trackPageView(route)
                val page = route["page"]

                when {
                    page == "blog" && route.containsKey("post") -> {
                        val post = ALL_POSTS.find { it.id == route["post"] }
                        if (post != null) {
                            document.title = "${post.title} | Miley Chandonnet"
                            updateMetaTags(
                                title = post.title,
                                description = post.excerpt,
                                url = "https://miley.codes/#page=blog&post=${post.id}",
                                image = "https://miley.codes/blog/${post.id}/demo.gif",
                            )
                            setMetaTag("property", "og:type", "article")
                        } else {
                            document.title = "Miley Chandonnet"
                        }
                    }
                    page == "blog" -> {
                        document.title = "Blog | Miley Chandonnet"
                        updateMetaTags(
                            title = "Blog | Miley Chandonnet",
                            description = "Native Android Application Engineer",
                            url = "https://miley.codes/#page=blog",
                            image = "https://miley.codes/blog/dark-factory-needs-windows/demo.gif",
                        )
                        setMetaTag("property", "og:type", "website")
                    }
                    else -> {
                        document.title = "Miley Chandonnet"
                        updateMetaTags(
                            title = "Miley Chandonnet",
                            description = "Native Android Application Engineer",
                            url = "https://miley.codes",
                            image = "https://miley.codes/blog/dark-factory-needs-windows/demo.gif",
                        )
                        setMetaTag("property", "og:type", "website")
                    }
                }

                header()

                pageNav(router)

                when {
                    page == "blog" && route.containsKey("post") -> {
                        route["post"]?.let { BlogStore.selectPost(it) }
                        blogPostView()
                    }
                    page == "blog" -> {
                        BlogStore.selectPost(null)
                        blogList(router)
                    }
                    else -> {
                        route["category"]?.let { name ->
                            Category.values().find { it.name == name }
                        }?.let { category ->
                            ExperienceStore.setSelectedCategory(category)
                        }

                        div("content") {
                            featuredExperiences()
                            experienceList()
                        }
                    }
                }
            }
    }
}
