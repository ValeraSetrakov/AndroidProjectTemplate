package com.comic.data_marvel.common.di

import com.comic.data_marvel.common.api.response.SummaryResponse
import com.comic.data_marvel.common.api.response.TypeSummaryResponse
import com.comic.data_marvel.common.repository.mapper.MarvelListMapper
import com.comic.data_marvel.common.repository.mapper.SummaryMapper
import com.comic.data_marvel.common.repository.mapper.TypeSummaryMapper
import com.comic.domain.common.entity.Summary
import com.comic.domain.common.entity.TypeSummary
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CommonModule {

    @Provides
    @Singleton
    fun provideMarvelListTypeSummaryMapper(
        mapper: TypeSummaryMapper
    ): MarvelListMapper<TypeSummaryResponse, TypeSummary> {
        return MarvelListMapper(
            mapper = mapper
        )
    }

    @Provides
    @Singleton
    fun provideMarvelListSummaryMapper(
        mapper: SummaryMapper
    ): MarvelListMapper<SummaryResponse, Summary> {
        return MarvelListMapper(
            mapper = mapper
        )
    }
}