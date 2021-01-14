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
        BaseViewModelModule::class,
        BaseInjectorFactoriesModule::class,
        DataModule::class,
        BaseFragmentModule::class
    ]
)
class ApplicationModule(
    private val baseApp: App
) {
    @Provides
    @Singleton
    fun provideApp(): App = baseApp

    @Provides
    @Singleton
    fun provideApplication(): Application = baseApp

    @Provides
    @Singleton
    fun provideContext(): Context = baseApp
}