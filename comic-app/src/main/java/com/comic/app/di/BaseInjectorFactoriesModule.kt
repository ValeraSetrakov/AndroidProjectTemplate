package com.comic.app.di

import com.comic.client.di.injector.InjectorProvider
import com.comic.client.di.injector.SimpleInjectorProvider
import com.comic.client_comics.di.ClientInjectorsModule
import com.comic.screen_marvel.di.MarvelInjectorsModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        ClientInjectorsModule::class,
        MarvelInjectorsModule::class
    ]
)
abstract class BaseInjectorFactoriesModule {

    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider
}