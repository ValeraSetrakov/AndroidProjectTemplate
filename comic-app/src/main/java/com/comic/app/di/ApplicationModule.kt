package com.comic.app.di

import android.app.Application
import android.content.Context
import com.comic.app.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        SubComponentsModule::class,
        BaseViewModelModule::class,
        BaseInjectorFactoriesModule::class,
        DataModule::class,
        BaseFragmentModule::class
    ]
)
class ApplicationModule(
    private val app: App
) {
    @Provides
    @Singleton
    fun provideApp(): App = app

    @Provides
    @Singleton
    fun provideApplication(): Application = app

    @Provides
    @Singleton
    fun provideContext(): Context = app
}