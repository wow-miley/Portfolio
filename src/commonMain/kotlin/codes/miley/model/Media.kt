package codes.miley.model

sealed class Media(
    open val uri: String,
) {
    data class Image(
        override val uri: String
    ) : Media(uri)

    data class Gif(
        override val uri: String,
        val gifUri: String,
    ) : Media(uri)
}
