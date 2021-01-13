package com.comic.data_marvel.comic.api.response

import com.google.gson.annotations.SerializedName

/**
 * type ([String], optional): A description of the date (e.g. onsale date, FOC date).,
 * date ([String], optional): The date.
 */
data class ComicDateResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("date")
    val date: String?
)