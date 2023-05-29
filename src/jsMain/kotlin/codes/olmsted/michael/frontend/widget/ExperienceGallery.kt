package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Media
import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import dev.fritz2.core.src

fun RenderContext.experienceGallery(
    media: List<Media>,
) {
    div("thumbnail-list") {
        media.forEach { item ->
            div("thumbnail") {
                a {
                    href("#${item.uri}")
                    img {
                        src("/experiences${item.uri}")
                    }
                }

                if (item is Media.Gif) {
                    h6("tag") { +"GIF" }
                }
            }

            a("lightbox transition", item.uri) {
                href("#_1")
                img {
                    when (item) {
                        is Media.Image -> src("/experiences${item.uri}")
                        is Media.Gif -> src("/experiences${item.gifUri}")
                    }
                }
            }
        }
    }
}
