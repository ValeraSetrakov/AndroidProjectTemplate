package com.comic.data_marvel.event.api

import com.comic.data_marvel.character.api.response.CharacterResponse
import com.comic.data_marvel.comic.api.response.ComicResponse
import com.comic.data_marvel.common.api.response.DataWrapperResponse
import com.comic.data_marvel.creator.api.response.CreatorResponse
import com.comic.data_marvel.event.api.response.EventResponse
import com.comic.data_marvel.series.api.response.SeriesResponse
import com.comic.data_marvel.story.api.response.StoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

private object Urls {
    const val QUERY_ID = "{eventId}"
    const val URL_BASE = "events"
    const val URL_SINGLE = "$URL_BASE/$QUERY_ID"
    const val URL_CHARACTERS = "$URL_BASE/$QUERY_ID/characters"
    const val URL_COMICS = "$URL_BASE/$QUERY_ID/comics"
    const val URL_CREATORS = "$URL_BASE/$QUERY_ID/creators"
    const val URL_SERIES = "$URL_BASE/$QUERY_ID/series"
    const val URL_STORIES = "$URL_BASE/$QUERY_ID/stories"
}

interface EventApi {

    /**
     * Fetches lists of events with optional filters
     */
    @GET(Urls.URL_BASE)
    suspend fun requestEvennts(): DataWrapperResponse<EventResponse>

    /**
     * Fetches a single event by id
     */
    @GET(Urls.URL_SINGLE)
    suspend fun requestEvent(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<EventResponse>

    /**
     * Fetches lists of characters which appear in a specific event, with optional filters.
     */
    @GET(Urls.URL_CHARACTERS)
    suspend fun requestCharacters(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<CharacterResponse>

    /**
     * Fetches lists of comics which take place during a specific event, with optional filters.
     */
    @GET(Urls.URL_COMICS)
    suspend fun requestComics(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<ComicResponse>

    /**
     * Fetches lists of comic creators whose work appears in a specific event, with optional filters.
     */
    @GET(Urls.URL_CREATORS)
    suspend fun requestCreators(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<CreatorResponse>

    /**
     * Fetches lists of comic series in which a specific event takes place, with optional filters.
     */
    @GET(Urls.URL_SERIES)
    suspend fun requestSeries(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<SeriesResponse>

    /**
     * Fetches lists of comic stories from a specific event, with optional filters.
     */
    @GET(Urls.URL_STORIES)
    suspend fun requestStories(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<StoryResponse>
}