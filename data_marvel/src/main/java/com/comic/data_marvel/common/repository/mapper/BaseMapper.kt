package com.comic.data_marvel.common.repository.mapper

interface BaseMapper<FROM, TO> {
    fun map(from: FROM?): TO
}