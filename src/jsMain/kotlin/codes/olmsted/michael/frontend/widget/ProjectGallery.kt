package codes.olmsted.michael.frontend.widget

import dev.fritz2.dom.html.RenderContext

fun RenderContext.projectImages() {
    div("project-gallery") {
        div("thumbnails") {
            a {
                href("#img_1")
                img {
                    src("https://image.freepik.com/free-photo/sunlight-in-the-forest_1004-9.jpg")
                }
            }

            a {
                href("#img_2")
                img {
                    src("https://image.freepik.com/free-photo/road-curve-landscape_426-19324358.jpg")
                }
            }

            a {
                href("#img_3")
                img {
                    src("https://image.freepik.com/free-photo/shiny-lights_385-19321244.jpg")
                }
            }

            a("lightbox transition", "img_1") {
                href("#_1")
            }

            a("lightbox transition", "img_2") {
                href("#_2")
            }

            a("lightbox transition", "img_3") {
                href("#_3")
            }
        }
    }
}
