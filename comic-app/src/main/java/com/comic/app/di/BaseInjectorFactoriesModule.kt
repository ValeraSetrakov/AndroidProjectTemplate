package com.comic.app.di

import com.comic.client.di.injector.InjectorProvider
import com.comic.client.di.injector.SimpleInjectorProvider
import dagger.Binds
import dagger.Module

@Module(
    includes = []
)
abstract class BaseInjectorFactoriesModule {

    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider
}