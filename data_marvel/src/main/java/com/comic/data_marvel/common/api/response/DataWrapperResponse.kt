package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * code ([Int], optional): The HTTP status code of the returned result.,
 * status ([String], optional): A string description of the call status.,
 * copyright ([String], optional): The copyright notice for the returned result.,
 * attributionText ([String], optional): The attribution notice for this result. Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.,
 * attributionHTML ([String], optional): An HTML representation of the attribution notice for this result. Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.,
 * data ([DataContainerResponse], optional): The results returned by the call.,
 * etag ([String], optional): A digest value of the content returned by the call.
 */
data class DataWrapperResponse<T>(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("copyright")
    val copyright: String?,
    @SerializedName("attributionText")
    val attributionText: String?,
    @SerializedName("attributionHTML")
    val attributionHTML: String?,
    @SerializedName("data")
    val data: DataContainerResponse<T>?,
    @SerializedName("etag")
    val etag: String?
)