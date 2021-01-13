package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * URLs are references to web pages or deep links into applications.
 * (When present in a resultset, it is preferred that you use these to link back to Marvel.)
 * Many resources will have more than one representation on the web so URLs are generally
 * presented as an array of URL resources. URLs are modeled as follows:
 * type	string	A text identifier for the URL.
 * url	string	A full URL (including scheme, domain, and path).
 */
data class URLResponse(
    @SerializedName("type")
    val type: String?,
    @SerializedName("url")
    val url: String?
)