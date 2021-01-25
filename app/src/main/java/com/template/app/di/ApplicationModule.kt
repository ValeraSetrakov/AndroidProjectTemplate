package com.template.app.di

import android.app.Application
import android.content.Context
import com.template.app.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
        includes = [
            SubComponentsModule::class,
            ViewModelsModule::class,
            InjectorFactoriesModule::class,
            DataModule::class,
            FragmentsModule::class
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