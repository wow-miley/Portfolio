package codes.olmsted.michael.frontend.store

import codes.olmsted.michael.model.ToDo
import codes.olmsted.michael.model.ToDoResource
import dev.fritz2.binding.RootStore
import dev.fritz2.repositories.rest.restQuery
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

object TodoStore : RootStore<List<ToDo>>(emptyList(), id = "todos") {

    private const val endpoint = "/api/todos"

    private val restRepo = restQuery<ToDo, Long, Unit>(ToDoResource, endpoint, -1)
    private val query = handle { restRepo.query(Unit) }

    // val save = handle<ToDo> { toDos, new ->
    //     if (validator.isValid(new, Unit)) restRepo.addOrUpdate(toDos, new)
    //     else toDos
    // }

    val remove = handle { toDos, id: Long ->
        restRepo.delete(toDos, id)
    }

    val toggleAll = handle { toDos, toggle: Boolean ->
        restRepo.updateMany(toDos, toDos.mapNotNull {
            if(it.completed != toggle) it.copy(completed = toggle) else null
        })
    }

    val clearCompleted = handle { toDos ->
        toDos.partition(ToDo::completed).let { (completed, uncompleted) ->
            restRepo.delete(toDos, completed.map(ToDo::id))
            uncompleted
        }
    }

    val count = data.map { todos -> todos.count { !it.completed } }.distinctUntilChanged()
    val empty = data.map { it.isEmpty() }.distinctUntilChanged()
    val allChecked = data.map { todos -> todos.isNotEmpty() && todos.all { it.completed } }.distinctUntilChanged()

    init {
        query()
    }
}
