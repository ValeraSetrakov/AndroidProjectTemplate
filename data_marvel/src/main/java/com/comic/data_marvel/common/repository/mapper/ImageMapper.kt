package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.ImageResponse
import com.comic.domain.common.entity.Image
import javax.inject.Inject

class ImageMapper @Inject constructor() : BaseMapper<ImageResponse, Image> {

    override fun map(from: ImageResponse?): Image {
        return Image(
            path = from?.path.orDefault(),
            extension = from?.extension.orDefault()
        )
    }
}