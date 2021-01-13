package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * Images are represented as a partial path and an extension.
 * See the guide to images for information about how to construct full paths to image files.
 * path	string	The directory path of to the image.
 * extension	string	The file extension for the image.
 */
data class ImageResponse(
    @SerializedName("path")
    val path: String?,
    @SerializedName("extension")
    val extension: String?
)