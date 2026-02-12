package codes.miley.frontend

import dev.fritz2.core.RenderContext
import org.w3c.dom.asList

@JsModule("marked")
@JsNonModule
external object Marked {
    fun parse(markdown: String): String
}

fun RenderContext.markdown(content: String) {
    div("article-body") {
        domNode.innerHTML = Marked.parse(content)
        domNode.querySelectorAll("a").asList().forEach { element ->
            (element as? org.w3c.dom.HTMLAnchorElement)?.let {
                it.target = "_blank"
                it.rel = "noopener noreferrer"
            }
        }
    }
}
