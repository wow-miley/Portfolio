package codes.miley.frontend.store

import codes.miley.model.ALL_POSTS
import codes.miley.model.BlogPost
import dev.fritz2.core.RootStore

object BlogStore : RootStore<BlogStore.State>(State(), id = "blog") {

    data class State(
        val posts: List<BlogPost> = ALL_POSTS,
        val selectedPostId: String? = null,
    )

    val selectPost = handle { state, postId: String? ->
        state.copy(selectedPostId = postId)
    }
}
