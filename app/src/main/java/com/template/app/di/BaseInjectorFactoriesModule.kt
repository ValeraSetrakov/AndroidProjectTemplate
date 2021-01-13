package com.template.app.di

import com.template.client.di.injector.InjectorProvider
import com.template.client.di.injector.SimpleInjectorProvider
import dagger.Binds
import dagger.Module

@Module(
    includes = []
)
abstract class BaseInjectorFactoriesModule {

    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider
}