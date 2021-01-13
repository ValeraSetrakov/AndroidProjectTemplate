package com.comic.data_marvel.common.repository.mapper

import com.comic.base.orDefault
import com.comic.data_marvel.common.api.response.TextObjectResponse
import com.comic.domain.common.entity.TextObject
import javax.inject.Inject

class TextObjectMapper @Inject constructor() : BaseMapper<TextObjectResponse, TextObject> {

    override fun map(from: TextObjectResponse?): TextObject {
        return TextObject(
            type = from?.type.orDefault(),
            language = from?.language.orDefault(),
            text = from?.text.orDefault()
        )
    }
}