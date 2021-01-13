package com.comic.data_marvel.character.api

import com.comic.data_marvel.character.api.response.CharacterResponse
import com.comic.data_marvel.comic.api.response.ComicResponse
import com.comic.data_marvel.common.api.response.DataContainerResponse
import com.comic.data_marvel.common.api.response.DataWrapperResponse
import com.comic.data_marvel.event.api.response.EventResponse
import com.comic.data_marvel.series.api.response.SeriesResponse
import com.comic.data_marvel.story.api.response.StoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

private object Urls {
    const val QUERY_ID = "{characterId}"
    const val URL_BASE = "characters"
    const val URL_SINGLE = "$URL_BASE/$QUERY_ID"
    const val URL_COMICS = "$URL_BASE/$QUERY_ID/comics"
    const val URL_EVENTS = "$URL_BASE/$QUERY_ID/events"
    const val URL_SERIES = "$URL_BASE/$QUERY_ID/series"
    const val URL_STORIES = "$URL_BASE/$QUERY_ID/stories"
}

interface CharacterApi {

    /**
     * Fetches lists of comic characters with optional filters
     */
    @GET(Urls.URL_BASE)
    suspend fun requestCharacters(
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null
    ): DataWrapperResponse<CharacterResponse>

    /**
     * Fetches a single character by id
     */
    @GET(Urls.URL_SINGLE)
    suspend fun requestCharacter(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<CharacterResponse>

    /**
     * Fetches lists of comics containing a specific character, with optional filters.
     */
    @GET(Urls.URL_COMICS)
    suspend fun requestComics(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<ComicResponse>

    /**
     * Fetches lists of events containing a specific character, with optional filters.
     */
    @GET(Urls.URL_EVENTS)
    suspend fun requestEvents(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<EventResponse>

    /**
     * Fetches lists of stories containing a specific character, with optional filters.
     */
    @GET(Urls.URL_STORIES)
    suspend fun requestStories(
        @Query(Urls.QUERY_ID) characterId: Int
    ): DataContainerResponse<StoryResponse>

    /**
     * Fetches lists of series containing a specific character, with optional filters.
     */
    @GET(Urls.URL_SERIES)
    suspend fun requestSeries(
        @Query(Urls.QUERY_ID) characterId: Int
    ): DataWrapperResponse<SeriesResponse>
}