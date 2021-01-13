package com.comic.data_marvel.character.api.response

import com.comic.data_marvel.common.api.response.*
import com.google.gson.annotations.SerializedName

/**
 * id	int	The unique ID of the character resource.
 * name	string	The name of the character.
 * description	string	A short bio or description of the character.
 * modified	Date	The date the resource was most recently modified.
 * resourceURI	string	The canonical URL identifier for this resource.
 * urls	List[URLResponse]	A set of public web site URLs for the resource.
 * thumbnail    [ImageResponse]	The representative image for this character.
 * comics    [ListResponse]	A resource list containing comics which feature this character.
 * stories    [ListResponse]	A resource list of stories in which this character appears.
 * events    [ListResponse]	A resource list of events in which this character appears.
 * series    [ListResponse]	A resource list of series in which this character appears.
 */
data class CharacterResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("urls")
    val urls: List<URLResponse>?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("comics")
    val comics: ListResponse<SummaryResponse>?,
    @SerializedName("stories")
    val stories: ListResponse<TypeSummaryResponse>?,
    @SerializedName("events")
    val events: ListResponse<SummaryResponse>?,
    @SerializedName("series")
    val series: ListResponse<SummaryResponse>?
)