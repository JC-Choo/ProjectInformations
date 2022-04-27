package dev.chu.infos.model

data class News(
    val index: Int,
    val title: String,
    val content: String,
    var url: String? = null
)

fun getItems() = mutableListOf<News>().apply {
    (0..10).forEach {
        add(News(it, "Test title_$it", "Test content", "https://www.naver.com"))
    }
}