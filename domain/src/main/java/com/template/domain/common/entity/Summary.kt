package com.template.domain.common.entity

open class Summary(
    val resourceURI: String,
    val name: String
)

class RoleSummary(
    resourceURI: String,
    name: String,
    val role: String
) : Summary(resourceURI, name)

class TypeSummary(
    resourceURI: String,
    name: String,
    val type: String
) : Summary(resourceURI, name)