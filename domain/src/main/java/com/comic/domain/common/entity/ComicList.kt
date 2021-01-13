package com.comic.domain.common.entity

data class ComicList<T>(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: List<T>
)