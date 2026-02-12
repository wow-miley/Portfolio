package codes.miley.frontend

import dev.fritz2.core.RenderContext

@JsModule("marked")
@JsNonModule
external object Marked {
    fun parse(markdown: String): String
}

fun RenderContext.markdown(content: String) {
    div("article-body") {
        domNode.innerHTML = Marked.parse(content)
    }
}
