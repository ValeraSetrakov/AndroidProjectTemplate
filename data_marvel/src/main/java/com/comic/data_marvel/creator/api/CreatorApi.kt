package com.comic.data_marvel.creator.api

import com.comic.data_marvel.comic.api.response.ComicResponse
import com.comic.data_marvel.common.api.response.DataWrapperResponse
import com.comic.data_marvel.creator.api.response.CreatorResponse
import com.comic.data_marvel.event.api.response.EventResponse
import com.comic.data_marvel.series.api.response.SeriesResponse
import com.comic.data_marvel.story.api.response.StoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

private object Urls {
    const val QUERY_ID = "{creatorId}"
    const val URL_BASE = "creators"
    const val URL_SINGLE = "$URL_BASE/$QUERY_ID"
    const val URL_COMICS = "$URL_BASE/$QUERY_ID/comics"
    const val URL_EVENTS = "$URL_BASE/$QUERY_ID/events"
    const val URL_SERIES = "$URL_BASE/$QUERY_ID/series"
    const val URL_STORIES = "$URL_BASE/$QUERY_ID/stories"
}

interface CreatorApi {

    /**
     * Fetches lists of creators characters with optional filters
     */
    @GET(Urls.URL_BASE)
    suspend fun requestCreators(): DataWrapperResponse<CreatorResponse>

    /**
     * Fetches a single creator by id
     */
    @GET(Urls.URL_SINGLE)
    suspend fun requestCreator(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<CreatorResponse>

    /**
     * Fetches lists of comics in which the work of a specific creator appears, with optional filters.
     */
    @GET(Urls.URL_COMICS)
    suspend fun requestComics(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<ComicResponse>

    /**
     * Fetches lists of events featuring the work of a specific creator with optional filters.
     */
    @GET(Urls.URL_EVENTS)
    suspend fun requestEvents(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<EventResponse>

    /**
     * Fetches lists of comic series in which a specific creator's work appears, with optional filters.
     */
    @GET(Urls.URL_SERIES)
    suspend fun requestSeries(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<SeriesResponse>

    /**
     * Fetches lists of comic stories by a specific creator with optional filters.
     */
    @GET(Urls.URL_STORIES)
    suspend fun requestCreators(
        @Query(Urls.QUERY_ID) id: Int
    ): DataWrapperResponse<StoryResponse>
}