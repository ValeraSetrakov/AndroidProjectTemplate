package com.comic.data_marvel.comic.api.response

import com.google.gson.annotations.SerializedName

/**
 * type ([String], optional): A description of the price (e.g. print price, digital price).,
 * price ([Float], optional): The price (all prices in USD).
 */
data class ComicPriceResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("price")
    val price: Float?
)