package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * available ([Int], optional): The number of total available series in this list. Will always be greater than or equal to the "returned" value.,
 * returned ([Int], optional): The number of series returned in this collection (up to 20).,
 * collectionURI ([String], optional): The path to the full list of series in this collection.,
 * items (Array[T], optional): The list of returned [T] in this collection.
 */
data class ListResponse<T>(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("returned")
    val returned: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<T>?
)