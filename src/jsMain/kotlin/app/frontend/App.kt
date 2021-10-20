package app.frontend

import app.frontend.store.ProjectStore
import app.frontend.widget.projectTile
import app.model.*
import dev.fritz2.dom.html.RenderContext
import dev.fritz2.dom.html.render
import dev.fritz2.routing.Router
import dev.fritz2.routing.router
import dev.fritz2.routing.select
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*

fun RenderContext.header(
    router: Router<Map<String, String>>,
) {
    section("categories") {
        h2 { +"Michael Olmsted" }
        h4 { +"Software Engineer" }

        nav {
            ul {
                Category
                    .values()
                    .map { it.route }
                    .forEach { route ->
                        li {
                            a {
                                +route

                                ProjectStore.data
                                    .map { it.filterConfig?.selectedCategory }
                                    .distinctUntilChanged()
                                    .render { category ->
                                        className(
                                            if (category?.route == route) "selected" else ""
                                        )
                                    }

                                clicks.map {
                                    mapOf(
                                        "category" to route
                                    )
                                } handledBy router.navTo
                            }
                        }
                    }
            }
        }
    }
}

fun RenderContext.projects() {
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

@ExperimentalCoroutinesApi
fun main() {
    val router = router(mapOf("category" to "all"))

    render("#target") {
        router
            .data
            .distinctUntilChanged()
            .render {
                it["category"]
                    ?.let(Category::valueOf)
                    ?.let { category ->
                        ProjectStore.setSelectedCategory(category)
                    }
            }

        div {
            header(router)
            projects()
        }
    }
}
//
// @ExperimentalCoroutinesApi
// fun RenderContext.mainSection() {
//     section("main") {
//         input("toggle-all", id = "toggle-all") {
//             type("checkbox")
//             checked(ToDoListStore.allChecked)
//
//             changes.states() handledBy ToDoListStore.toggleAll
//         }
//         label {
//             `for`("toggle-all")
//             +"Mark all as complete"
//         }
//         ul("todo-list") {
//             ToDoListStore.data.combine(router.data) { all, route ->
//                 filters[route]?.function?.invoke(all) ?: all
//             }.renderEach(ToDo::id) { toDo ->
//                 val toDoStore = storeOf(toDo)
//                 toDoStore.syncBy(ToDoListStore.save)
//                 val textStore = toDoStore.sub(L.ToDo.text)
//                 val completedStore = toDoStore.sub(L.ToDo.completed)
//
//                 val editingStore = storeOf(false)
//
//                 li {
//                     attr("data-id", toDoStore.id)
//                     classMap(toDoStore.data.combine(editingStore.data) { toDo, isEditing ->
//                         mapOf(
//                             "completed" to toDo.completed,
//                             "editing" to isEditing
//                         )
//                     })
//                     div("view") {
//                         input("toggle") {
//                             type("checkbox")
//                             checked(completedStore.data)
//
//                             changes.states() handledBy completedStore.update
//                         }
//                         label {
//                             textStore.data.asText()
//
//                             dblclicks.map { true } handledBy editingStore.update
//                         }
//                         button("destroy") {
//                             clicks.events.map { toDo.id } handledBy ToDoListStore.remove
//                         }
//                     }
//                     input("edit") {
//                         value(textStore.data)
//                         changes.values() handledBy textStore.update
//
//                         editingStore.data.map { isEditing ->
//                             if (isEditing) domNode.apply {
//                                 focus()
//                                 select()
//                             }
//                             isEditing.toString()
//                         }.watch()
//                         merge(
//                             blurs.map { false },
//                             keyups.key().filter { it == Keys.Enter }.map { false }
//                         ) handledBy editingStore.update
//                     }
//                 }
//             }
//         }
//     }
// }
//
