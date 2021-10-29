package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.model.Project
import dev.fritz2.dom.html.RenderContext

fun RenderContext.projectTile(
    project: Project,
) {
    with(project) {
        div("project-tile col") {
            h1 { +name }
            h3 { +category.name }
        }
    }
}
