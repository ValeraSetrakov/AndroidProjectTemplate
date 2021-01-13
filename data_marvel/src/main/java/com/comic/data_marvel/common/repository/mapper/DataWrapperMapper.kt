package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.DataWrapperResponse
import com.comic.domain.common.entity.DataWrapper
import javax.inject.Inject

class DataWrapperMapper<RESPONSE, ENTITY> @Inject constructor(
    private val mapper: DataContainerMapper<RESPONSE, ENTITY>
) : BaseMapper<DataWrapperResponse<RESPONSE>, DataWrapper<ENTITY>> {

    override fun map(from: DataWrapperResponse<RESPONSE>?): DataWrapper<ENTITY> {
        return DataWrapper(
            code = from?.code.orDefault(),
            status = from?.status.orDefault(),
            copyright = from?.copyright.orDefault(),
            attributionHTML = from?.attributionHTML.orDefault(),
            attributionText = from?.attributionText.orDefault(),
            data = mapper.map(from?.data),
            etag = from?.etag.orDefault()
        )
    }
}