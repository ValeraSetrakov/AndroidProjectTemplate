package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * Text objects are bits of descriptive text which are attached to an entity.
 * They have the following properties:
 * type	string	The string description of the text object (e.g. solicit text, preview text, etc.).
 * language	string	A language code denoting which language the text object is written in.
 * text	string	The text of the text object.
 */
data class TextObjectResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("text")
    val text: String?
)