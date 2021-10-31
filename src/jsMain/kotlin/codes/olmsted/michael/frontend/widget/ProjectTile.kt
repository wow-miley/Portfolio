package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Project
import dev.fritz2.dom.html.RenderContext

fun RenderContext.projectTile(
    project: Project,
) {
    with(project) {
        div("project-tile col") {
            div("project-header row") {
                img {
                }

                div("project-header col") {
                    h1 { +name }
                    h5 { +title }

                    div("tags") {
                        h6 { +category.name }
                    }
                }
            }

            projectImages()

            p { +"developing a international blah blah" }
        }
    }
}
