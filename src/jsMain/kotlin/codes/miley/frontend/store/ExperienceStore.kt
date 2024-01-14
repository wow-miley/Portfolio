package codes.miley.frontend.store

import codes.miley.model.ALL_EXPERIENCES
import codes.miley.model.Category
import codes.miley.model.FilterConfig
import codes.miley.model.Experience
import codes.miley.model.Skill
import dev.fritz2.core.RootStore

object ExperienceStore : RootStore<ExperienceStore.State>(State(), id = "categories") {

    data class State(
        val categories: List<Category> = Category.values().toList(),
        val experiences: List<Experience> = ALL_EXPERIENCES,
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
