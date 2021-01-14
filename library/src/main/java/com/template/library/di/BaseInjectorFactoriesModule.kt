package com.template.library.di

import com.template.client.di.injector.Injector
import com.template.client.di.injector.InjectorProvider
import com.template.client.di.injector.InjectorTarget
import com.template.client.di.injector.SimpleInjectorProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

@Module(
    includes = []
)
abstract class BaseInjectorFactoriesModule {

    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<Class<out InjectorTarget>, Injector.Factory<*, *>>
}