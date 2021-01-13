package com.comic.data_marvel.di

import android.content.Context
import com.comic.data_marvel.MarvelAuthorizationInterceptor
import com.comic.data_marvel.MarvelEtagInterceptor
import com.comic.data_marvel.character.di.MarvelCharacterModule
import com.comic.data_marvel.common.api.BaseUrls
import com.comic.data_marvel.common.di.CommonModule
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(
    includes = [
        CommonModule::class,
        MarvelCharacterModule::class
    ]
)
class MarvelDataModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BaseUrls.URL_BASE)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(cache: Cache): OkHttpClient {
        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(MarvelEtagInterceptor())
            .addInterceptor(MarvelAuthorizationInterceptor())
            .addInterceptor(HttpLoggingInterceptor().apply {
                setLevel(HttpLoggingInterceptor.Level.BODY)
            })
            .build()
    }

    @Provides
    @Singleton
    fun provideCache(context: Context): Cache {
        return Cache(
            directory = context.cacheDir,
            maxSize = 10L * 1024L * 1024L // 10 MiB
        )
    }
}