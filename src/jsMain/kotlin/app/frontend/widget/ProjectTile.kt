package app.frontend.widget

import app.model.Project
import dev.fritz2.dom.html.RenderContext

fun RenderContext.projectTile(
    project: Project,
) {
    with(project) {
        div("project-tile") {
            h1 { +name }
            h3 { +category.name }
        }
    }
}
