package codes.olmsted.michael.frontend.store

import codes.olmsted.michael.model.Category
import codes.olmsted.michael.model.FilterConfig
import codes.olmsted.michael.model.Project
import codes.olmsted.michael.model.STUB_PROJECTS
import codes.olmsted.michael.model.Skill
import dev.fritz2.binding.RootStore

object ProjectStore : RootStore<ProjectStore.State>(State(), id = "categories") {

    data class State(
        val categories: List<Category> = Category.values().toList(),
        val projects: List<Project> = STUB_PROJECTS,
        val filterConfig: FilterConfig? = null,
    )

    val setSelectedCategory = handle { state, category: Category? ->
            state.copy(
                filterConfig = state.filterConfig?.copy(
                    selectedCategory = category,
                ),
            )
    }

    val toggleSelectedSkill = handle { state, selection: Pair<Skill, Boolean> ->
        selection
            .let { (skill, enabled) ->
                state.copy(
                    filterConfig = state.filterConfig?.copy(
                        selectedSkills = state.filterConfig.selectedSkills?.let {
                            if (enabled) {
                                it.plus(skill)
                            } else {
                                it.minus(skill)
                            }
                        }
                    )
                )
            }
    }
}
