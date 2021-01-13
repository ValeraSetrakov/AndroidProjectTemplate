package com.comic.data_marvel.character.repository

import com.comic.base.orDefault
import com.comic.data_marvel.character.api.response.CharacterResponse
import com.comic.data_marvel.common.api.response.SummaryResponse
import com.comic.data_marvel.common.api.response.TypeSummaryResponse
import com.comic.data_marvel.common.repository.mapper.BaseMapper
import com.comic.data_marvel.common.repository.mapper.ImageMapper
import com.comic.data_marvel.common.repository.mapper.MarvelListMapper
import com.comic.data_marvel.common.repository.mapper.MarvelURLMapper
import com.comic.domain.character.Character
import com.comic.domain.common.entity.Summary
import com.comic.domain.common.entity.TypeSummary
import javax.inject.Inject

class CharacterMapper @Inject constructor(
    private val urlMapper: MarvelURLMapper,
    private val imageMapper: ImageMapper,
    private val typeSummaryListMapper: MarvelListMapper<TypeSummaryResponse, TypeSummary>,
    private val summaryListMapper: MarvelListMapper<SummaryResponse, Summary>
) : BaseMapper<CharacterResponse, Character> {

    override fun map(from: CharacterResponse?): Character {
        return Character(
            id = from?.id.orDefault(),
            name = from?.name.orDefault(),
            description = from?.description.orDefault(),
            modified = from?.modified.orDefault(),
            resourceURI = from?.resourceURI.orDefault(),
            urls = from?.urls?.map { urlMapper.map(it) }.orDefault(),
            thumbnail = imageMapper.map(from?.thumbnail),
            comics = summaryListMapper.map(from?.comics),
            stories = typeSummaryListMapper.map(from?.stories),
            events = summaryListMapper.map(from?.events),
            series = summaryListMapper.map(from?.series)
        )
    }
}