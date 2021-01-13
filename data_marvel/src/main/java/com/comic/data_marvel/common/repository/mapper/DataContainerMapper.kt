package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.DataContainerResponse
import com.comic.domain.common.entity.DataContainer

class DataContainerMapper<RESPONSE, ENTITY>(
    private val mapper: BaseMapper<RESPONSE, ENTITY>
) : BaseMapper<DataContainerResponse<RESPONSE>, DataContainer<ENTITY>> {

    override fun map(from: DataContainerResponse<RESPONSE>?): DataContainer<ENTITY> {
        return DataContainer(
            offset = from?.offset.orDefault(),
            limit = from?.limit.orDefault(),
            total = from?.total.orDefault(),
            count = from?.count.orDefault(),
            results = from?.results?.map {
                mapper.map(it)
            }.orDefault()
        )
    }
}