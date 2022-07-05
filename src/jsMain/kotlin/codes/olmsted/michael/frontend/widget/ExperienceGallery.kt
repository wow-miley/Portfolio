package codes.olmsted.michael.frontend.widget

import dev.fritz2.dom.html.RenderContext

fun RenderContext.experienceImages(
    imageUris: List<String>,
) {
    div("thumbnail-list") {
        imageUris.forEach { uri ->
            a("thumbnail") {
                href("#$uri")
                img {
                    src("/experiences$uri")
                }
            }

            a("lightbox transition", uri) {
                href("#_1")
                img {
                    src("/experiences$uri")
                }
            }
        }
    }
}
