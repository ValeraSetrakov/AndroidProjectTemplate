package com.comic.data_marvel.character.di

import com.comic.data_marvel.MarvelApiFactory
import com.comic.data_marvel.character.api.CharacterApi
import com.comic.data_marvel.character.api.response.CharacterResponse
import com.comic.data_marvel.character.repository.CharacterMapper
import com.comic.data_marvel.character.repository.CharacterRepository
import com.comic.data_marvel.character.repository.SimpleCharacterRepository
import com.comic.data_marvel.common.api.response.SummaryResponse
import com.comic.data_marvel.common.api.response.TypeSummaryResponse
import com.comic.data_marvel.common.repository.mapper.*
import com.comic.domain.character.Character
import com.comic.domain.common.entity.Summary
import com.comic.domain.common.entity.TypeSummary
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        AbstractMarvelCharacterModule::class
    ]
)
class MarvelCharacterModule {

    @Provides
    @Singleton
    fun provideCharacterApi(marvelApiFactory: MarvelApiFactory): CharacterApi {
        return marvelApiFactory.create(
            clazz = CharacterApi::class.java
        )
    }

    @Provides
    @Singleton
    fun provideCharacterDataWrapperMapper(
        dataContainerMapper: DataContainerMapper<CharacterResponse, Character>
    ): DataWrapperMapper<CharacterResponse, Character> {
        return DataWrapperMapper(
            mapper = dataContainerMapper
        )
    }

    @Provides
    @Singleton
    fun provideCharacterDataContainerMapper(
        mapper: CharacterMapper
    ): DataContainerMapper<CharacterResponse, Character> {
        return DataContainerMapper(
            mapper = mapper
        )
    }

    @Provides
    @Singleton
    fun provideCharacterMapper(
        urlMapper: MarvelURLMapper,
        imageMapper: ImageMapper,
        typeSummaryListMapper: MarvelListMapper<TypeSummaryResponse, TypeSummary>,
        summaryListMapper: MarvelListMapper<SummaryResponse, Summary>
    ): CharacterMapper {
        return CharacterMapper(
            urlMapper = urlMapper,
            imageMapper = imageMapper,
            typeSummaryListMapper = typeSummaryListMapper,
            summaryListMapper = summaryListMapper
        )
    }
}

@Module
abstract class AbstractMarvelCharacterModule {

    @Binds
    abstract fun bindCharacterRepository(
        repository: SimpleCharacterRepository
    ): CharacterRepository
}