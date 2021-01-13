package com.comic.data_marvel

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import javax.inject.Inject

class MarvelApiFactory @Inject constructor(
    private val retrofit: Retrofit
) {
    fun <T> create(clazz: Class<T>): T {
        return retrofit.create(clazz)
    }
}

open class SimpleInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return handleResponse(
            chain.proceed(
                handleRequest(
                    chain.request()
                )
            )
        )
    }

    open fun handleRequest(request: Request): Request {
        return request
    }

    open fun handleResponse(response: Response): Response {
        return response
    }
}

class MarvelAuthorizationInterceptor : SimpleInterceptor() {

    override fun handleRequest(request: Request): Request {
        return super.handleRequest(request).newBuilder()
            .addHeader("Referer", "developer.marvel.com")
            .url(
                request.url.newBuilder()
                    .addQueryParameter("apikey", "80511e920b3fe8f0102f7e85fc6e260a")
                    .build()
            )
            .build()
    }
}

internal class MarvelEtagInterceptor: SimpleInterceptor() {

    override fun handleRequest(request: Request): Request {
        return super.handleRequest(request).newBuilder()
//            .addHeader("If-None-Match", "7fc1b1900416a5efcdcff5338ca5ab01cf4d5aae")
            .addHeader("Cache-Control", "no-cache")
            .build()
    }

    override fun handleResponse(response: Response): Response {
        val modifiedResponse = super.handleResponse(response)
            .newBuilder()
            .addHeader("Cache-Control", "must-revalidate")
            .build()
        if (!modifiedResponse.isSuccessful && modifiedResponse.code == 304) {
            return modifiedResponse.cacheResponse ?: modifiedResponse
        }
        return modifiedResponse
    }
}