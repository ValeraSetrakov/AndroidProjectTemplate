package com.comic.data_marvel.series.api.response

import com.comic.data_marvel.common.api.response.*
import com.google.gson.annotations.SerializedName

/**
 * id	[Int]	The unique ID of the series resource.
 * title	[String]	The canonical title of the series.
 * description	[String]	A description of the series.
 * resourceURI	[String]	The canonical URL identifier for this resource.
 * urls	Array[URLResponse]	A set of public web site URLs for the resource.
 * startYear	[Int]	The first year of publication for the series.
 * endYear	[Int]	The last year of publication for the series (conventionally, 2099 for ongoing series).
 * rating	[String]	The age-appropriateness rating for the series.
 * modified	[String]	The date the resource was most recently modified.
 * thumbnail	[ImageResponse]	The representative image for this series.
 * comics	[ListResponse]	A resource list containing comics in this series.
 * stories	[ListResponse]	A resource list containing stories which occur in comics in this series.
 * events	[ListResponse]	A resource list containing events which take place in comics in this series.
 * characters	[ListResponse]	A resource list containing characters which appear in comics in this series.
 * creators	[ListResponse]	A resource list of creators whose work appears in comics in this series.
 * next	[SeriesResponse]	A summary representation of the series which follows this series.
 * previous	[SeriesResponse]	A summary representation of the series which preceded this series.
 */
data class SeriesResponse(
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
    @SerializedName("startYear")
    val startYear: Int?,
    @SerializedName("endYear")
    val endYear: Int?,
    @SerializedName("rating")
    val rating: String?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("comics")
    val comics: ListResponse<SummaryResponse>?,
    @SerializedName("stories")
    val stories: ListResponse<TypeSummaryResponse>?,
    @SerializedName("events")
    val events: ListResponse<SummaryResponse>?,
    @SerializedName("characters")
    val characters: ListResponse<RoleSummaryResponse>?,
    @SerializedName("creators")
    val creators: ListResponse<RoleSummaryResponse>?,
    @SerializedName("next")
    val next: SummaryResponse?,
    @SerializedName("previous")
    val previous: SummaryResponse?
)