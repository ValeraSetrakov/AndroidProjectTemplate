package com.comic.data_marvel.event.api.response

import com.comic.data_marvel.common.api.response.*
import com.google.gson.annotations.SerializedName

/**
 * id	[Int]	The unique ID of the event resource.
 * title	[String]	The title of the event.
 * description	[String]	A description of the event.
 * resourceURI	[String]	The canonical URL identifier for this resource.
 * urls	Array[URLResponse]	A set of public web site URLs for the event.
 * modified	[String]	The date the resource was most recently modified.
 * start	[String]	The date of publication of the first issue in this event.
 * end	[String]	The date of publication of the last issue in this event.
 * thumbnail	[ImageResponse]	The representative image for this event.
 * comics	[ListResponse]	A resource list containing the comics in this event.
 * stories	[ListResponse]	A resource list containing the stories in this event.
 * series	[ListResponse]	A resource list containing the series in this event.
 * characters	[ListResponse]	A resource list containing the characters which appear in this event.
 * creators	[ListResponse]	A resource list containing creators whose work appears in this event.
 * next	[SummaryResponse]	A summary representation of the event which follows this event.
 * previous	[SummaryResponse]	A summary representation of the event which preceded this event.
 */
data class EventResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("urls")
    val urls: List<URLResponse>?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("start")
    val start: String?,
    @SerializedName("end")
    val end: String?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("comics")
    val comics: ListResponse<SummaryResponse>?,
    @SerializedName("stories")
    val stories: ListResponse<TypeSummaryResponse>?,
    @SerializedName("series")
    val series: ListResponse<SummaryResponse>?,
    @SerializedName("characters")
    val characters: ListResponse<RoleSummaryResponse>?,
    @SerializedName("creators")
    val creators: ListResponse<RoleSummaryResponse>?,
    @SerializedName("next")
    val next: SummaryResponse?,
    @SerializedName("previous")
    val previous: SummaryResponse?
)