package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * offset ([Int], optional): The requested offset (number of skipped results) of the call.,
 * limit ([Int], optional): The requested result limit.,
 * total ([Int], optional): The total number of resources available given the current filter set.,
 * count ([Int], optional): The total number of results returned by this call.,
 * results (List[T], optional): The list of characters returned by the call.
 */
data class DataContainerResponse<T>(
    @SerializedName("offset")
    val offset: Int?,
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("total")
    val total: Int?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("results")
    val results: List<T>?
)