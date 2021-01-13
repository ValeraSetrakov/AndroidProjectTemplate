package com.comic.domain.character

import com.comic.domain.common.entity.*

interface BaseCharacter {
    val id: Int
    val name: String
    val description: String
    val thumbnail: Image
}

data class Character(
    override val id: Int,
    override val name: String,
    override val description: String,
    val modified: String,
    val resourceURI: String,
    val urls: List<ComicURL>,
    override val thumbnail: Image,
    val comics: ComicList<Summary>,
    val stories: ComicList<TypeSummary>,
    val events: ComicList<Summary>,
    val series: ComicList<Summary>
) : BaseCharacter