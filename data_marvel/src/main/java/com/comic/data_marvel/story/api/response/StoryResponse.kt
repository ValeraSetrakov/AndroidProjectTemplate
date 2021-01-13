package com.comic.data_marvel.story.api.response

import com.comic.data_marvel.common.api.response.ImageResponse
import com.comic.data_marvel.common.api.response.ListResponse
import com.comic.data_marvel.common.api.response.RoleSummaryResponse
import com.comic.data_marvel.common.api.response.SummaryResponse
import com.google.gson.annotations.SerializedName

/**
 * id	[Int]	The unique ID of the story resource.
 * title	[String]	The story title.
 * description	[String]	A short description of the story.
 * resourceURI	[String]	The canonical URL identifier for this resource.
 * type	[String]	The story type e.g. interior story, cover, text story.
 * modified	[String]	The date the resource was most recently modified.
 * thumbnail	[ImageResponse]	The representative image for this story.
 * comics	[ListResponse]	A resource list containing comics in which this story takes place.
 * series	[ListResponse]	A resource list containing series in which this story appears.
 * events	[ListResponse]	A resource list of the events in which this story appears.
 * characters	[ListResponse]	A resource list of characters which appear in this story.
 * creators	[ListResponse]	A resource list of creators who worked on this story.
 * originalissue	[originalissue]	A summary representation of the issue in which this story was originally published.
 */
data class StoryResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("comics")
    val comics: ListResponse<SummaryResponse>?,
    @SerializedName("series")
    val series: ListResponse<SummaryResponse>?,
    @SerializedName("events")
    val events: ListResponse<SummaryResponse>?,
    @SerializedName("characters")
    val characters: ListResponse<RoleSummaryResponse>?,
    @SerializedName("creators")
    val creators: ListResponse<RoleSummaryResponse>?,
    @SerializedName("originalissue")
    val originalissue: SummaryResponse?
)