package codes.olmsted.michael.frontend.widget

import codes.olmsted.michael.frontend.store.ProjectStore
import codes.olmsted.michael.model.filterBy
import dev.fritz2.dom.html.RenderContext
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

fun RenderContext.projectList() {
    section("project-list") {
        ProjectStore.data
            .map {  state ->
                state.projects.filterBy(state.filterConfig)
            }
            .distinctUntilChanged()
            .render { projects ->
                projects.forEach { project ->
                    projectTile(project)
                }
            }
    }
}
