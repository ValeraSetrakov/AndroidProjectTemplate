package com.comic.data_marvel.comic.api.response

import com.comic.data_marvel.common.api.response.*
import com.google.gson.annotations.SerializedName

/**
 * id    [Int]	The unique id of the comic resource.
 * digitalId    [Int]	The id of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
 * title	[String]	The canonical title of the comic.
 * issueNumber	[Int]	The number of the issue in the series (will generally be 0 for collection formats).
 * variantDescription	[String]	If the issue is a variant (e.g. an alternate cover, second printing, or director's cut), a text description of the variant.
 * description	[String]	The preferred description of the comic.
 * modified	[String]	The date the resource was most recently modified.
 * isbn	[String]	The ISBN for the comic (generally only populated for collection formats).
 * upc	[String]	The UPC barcode number for the comic (generally only populated for periodical formats).
 * diamondCode	[String]	The Diamond code for the comic.
 * ean	[String]	The EAN barcode for the comic.
 * issn	[String]	The ISSN barcode for the comic.
 * format	[String]	The publication format of the comic e.g. comic, hardcover, trade paperback.
 * pageCount	[Int]	The number of story pages in the comic.
 * textObjects	Array[TextObjectResponse]	A set of descriptive text blurbs for the comic.
 * resourceURI	[String]	The canonical URL identifier for this resource.
 * urls	Array[URLResponse]	A set of public web site URLs for the resource.
 * series	[SummaryResponse]	A summary representation of the series to which this comic belongs.
 * variants	Array[SummaryResponse]	A list of variant issues for this comic (includes the "original" issue if the current issue is a variant).
 * collections	Array[SummaryResponse]	A list of collections which include this comic (will generally be empty if the comic's format is a collection).
 * collectedIssues	Array[SummaryResponse]	A list of issues collected in this comic (will generally be empty for periodical formats such as "comic" or "magazine").
 * dates	Array[ComicDateResponse]	A list of key dates for this comic.
 * prices	Array[ComicPriceResponse]	A list of prices for this comic.
 * thumbnail	[ImageResponse]	The representative image for this comic.
 * images	Array[ImageResponse]	A list of promotional images associated with this comic.
 * creators	[ListResponse]	A resource list containing the creators associated with this comic.
 * characters	[ListResponse]	A resource list containing the characters which appear in this comic.
 * stories	[ListResponse]	A resource list containing the stories which appear in this comic.
 * events	[ListResponse]	A resource list containing the events in which this comic appears.
 */
data class ComicResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("digitalId")
    val digitalId: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("issueNumber")
    val issueNumber: Int?,
    @SerializedName("variantDescription")
    val variantDescription: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("isbn")
    val isbn: String,
    @SerializedName("upc")
    val upc: String?,
    @SerializedName("diamondCode")
    val diamondCode: String,
    @SerializedName("ean")
    val ean: String,
    @SerializedName("issn")
    val issn: String,
    @SerializedName("format")
    val format: String?,
    @SerializedName("pageCount")
    val pageCount: Int?,
    @SerializedName("textObjects")
    val textObjects: List<TextObjectResponse>?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("urls")
    val urls: List<URLResponse>?,
    @SerializedName("series")
    val series: SummaryResponse?,
    @SerializedName("variants")
    val variants: List<SummaryResponse>?,
    @SerializedName("collections")
    val collections: List<SummaryResponse>?,
    @SerializedName("collectedIssues")
    val collectedIssues: List<SummaryResponse>?,
    @SerializedName("dates")
    val dates: List<ComicDateResponse>?,
    @SerializedName("prices")
    val prices: List<ComicPriceResponse>?,
    @SerializedName("thumbnail")
    val thumbnail: ImageResponse?,
    @SerializedName("images")
    val images: List<ImageResponse>?,
    @SerializedName("creators")
    val creators: ListResponse<RoleSummaryResponse>?,
    @SerializedName("characters")
    val characters: ListResponse<RoleSummaryResponse>?,
    @SerializedName("stories")
    val stories: ListResponse<TypeSummaryResponse>?,
    @SerializedName("events")
    val events: ListResponse<SummaryResponse>?
)