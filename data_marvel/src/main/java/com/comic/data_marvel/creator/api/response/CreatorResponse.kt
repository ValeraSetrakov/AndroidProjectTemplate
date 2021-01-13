package com.comic.data_marvel.creator.api.response

import com.comic.data_marvel.common.api.response.*
import com.google.gson.annotations.SerializedName

/**
 * id	[Int]	The unique ID of the creator resource.
 * firstName	[String]	The first name of the creator.
 * middleName	[String]	The middle name of the creator.
 * lastName	[String]	The last name of the creator.
 * suffix	[String]	The suffix or honorific for the creator.
 * fullName	[String]	The full name of the creator (a space-separated concatenation of the above four fields).
 * modified	[String]	The date the resource was most recently modified.
 * resourceURI	[String]	The canonical URL identifier for this resource.
 * urls	Array[URLResponse]	A set of public web site URLs for the resource.
 * thumbnail	[ImageResponse]	The representative image for this creator.
 * series	[ListResponse]	A resource list containing the series which feature work by this creator.
 * stories	[ListResponse]	A resource list containing the stories which feature work by this creator.
 * comics	[ListResponse]	A resource list containing the comics which feature work by this creator.
 * events	[ListResponse]	A resource list containing the events which feature work by this creator.
 */
data class CreatorResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("firstName")
    val firstName: String?,
    @SerializedName("middleName")
    val middleName: String?,
    @SerializedName("lastName")
    val lastName: String?,
    @SerializedName("suffix")
    val suffix: String?,
    @SerializedName("fullName")
    val fullName: String?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("urls")
    val urls: List<URLResponse>?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("series")
    val series: ListResponse<SummaryResponse>?,
    @SerializedName("stories")
    val stories: ListResponse<TypeSummaryResponse>?,
    @SerializedName("comics")
    val comics: ListResponse<SummaryResponse>?,
    @SerializedName("events")
    val events: ListResponse<SummaryResponse>?
)