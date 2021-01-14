package com.template.app.di

import android.app.Application
import android.content.Context
import com.template.library.BaseApp
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
        private val baseApp: BaseApp
) {
    @Provides
    @Singleton
    fun provideApp(): BaseApp = baseApp

    @Provides
    @Singleton
    fun provideApplication(): Application = baseApp

    @Provides
    @Singleton
    fun provideContext(): Context = baseApp
}