package com.comic.data_marvel.common.api.response

import com.google.gson.annotations.SerializedName

/**
 * resourceURI ([String], optional): The path to the individual comic resource.,
 * name ([String], optional): The canonical name of the entity.
 */
open class SummaryResponse(
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("name")
    val name: String?
)

/**
 * role ([String], optional): The role of the entity in the parent entity.
 */
class RoleSummaryResponse(
    resourceURI: String?,
    name: String?,
    @SerializedName("role")
    val role: String?
): SummaryResponse(resourceURI, name)

/**
 * type ([String], optional): The type of the entity.
 */
class TypeSummaryResponse(
    resourceURI: String?,
    name: String?,
    @SerializedName("type")
    val type: String?
): SummaryResponse(resourceURI, name)