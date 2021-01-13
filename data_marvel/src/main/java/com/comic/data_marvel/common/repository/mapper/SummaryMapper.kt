package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.RoleSummaryResponse
import com.comic.data_marvel.common.api.response.SummaryResponse
import com.comic.data_marvel.common.api.response.TypeSummaryResponse
import com.comic.domain.common.entity.RoleSummary
import com.comic.domain.common.entity.Summary
import com.comic.domain.common.entity.TypeSummary
import javax.inject.Inject

class SummaryMapper @Inject constructor() : BaseMapper<SummaryResponse, Summary> {

    override fun map(from: SummaryResponse?): Summary {
        return Summary(
            resourceURI = from?.resourceURI.orDefault(),
            name = from?.name.orDefault()
        )
    }
}

class TypeSummaryMapper @Inject constructor() : BaseMapper<TypeSummaryResponse, TypeSummary> {

    override fun map(from: TypeSummaryResponse?): TypeSummary {
        return TypeSummary(
            resourceURI = from?.resourceURI.orDefault(),
            name = from?.name.orDefault(),
            type = from?.type.orDefault()
        )
    }
}

class RoleSummaryMapper @Inject constructor() : BaseMapper<RoleSummaryResponse, RoleSummary> {

    override fun map(from: RoleSummaryResponse?): RoleSummary {
        return RoleSummary(
            resourceURI = from?.resourceURI.orDefault(),
            name = from?.name.orDefault(),
            role = from?.role.orDefault()
        )
    }
}