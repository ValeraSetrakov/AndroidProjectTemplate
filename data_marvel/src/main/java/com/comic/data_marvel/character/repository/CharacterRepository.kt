package com.comic.data_marvel.character.repository

import com.comic.data_marvel.character.api.CharacterApi
import com.comic.data_marvel.character.api.response.CharacterResponse
import com.comic.data_marvel.common.repository.BaseRepository
import com.comic.data_marvel.common.repository.mapper.DataWrapperMapper
import com.comic.domain.character.Character
import com.comic.domain.common.entity.DataWrapper
import javax.inject.Inject
import javax.inject.Singleton

interface CharacterRepository {
    suspend fun getCharacters(
        limit: Int? = null,
        offset: Int? = null
    ): DataWrapper<Character>
}

@Singleton
class SimpleCharacterRepository @Inject constructor(
    private val characterApi: CharacterApi,
    private val dataWrapperMapper: DataWrapperMapper<CharacterResponse, Character>
) : BaseRepository(), CharacterRepository {

    override suspend fun getCharacters(
        limit: Int?,
        offset: Int?
    ): DataWrapper<Character> =
        dataWrapperMapper.map(
            characterApi.requestCharacters(
                limit = limit,
                offset = offset
            )
        )
}