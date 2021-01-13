package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.ListResponse
import com.comic.domain.common.entity.ComicList
import javax.inject.Inject

class MarvelListMapper<RESPONSE, ENTITY> @Inject constructor(
    private val mapper: BaseMapper<RESPONSE, ENTITY>
) : BaseMapper<ListResponse<RESPONSE>, ComicList<ENTITY>> {

    override fun map(from: ListResponse<RESPONSE>?): ComicList<ENTITY> {
        return ComicList(
            available = from?.available.orDefault(),
            returned = from?.returned.orDefault(),
            collectionURI = from?.collectionURI.orDefault(),
            items = from?.items?.map { mapper.map(it) }.orDefault()
        )
    }
}