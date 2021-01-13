package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.URLResponse
import com.comic.domain.common.entity.ComicURL
import javax.inject.Inject

class MarvelURLMapper @Inject constructor() : BaseMapper<URLResponse, ComicURL> {

    override fun map(from: URLResponse?): ComicURL {
        return ComicURL(
            type = from?.type.orDefault(),
            url = from?.url.orDefault()
        )
    }
}