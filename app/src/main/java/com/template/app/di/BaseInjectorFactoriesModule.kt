package com.template.app.di

import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorProvider
import com.template.library.client.di.injector.InjectorTarget
import com.template.library.client.di.injector.SimpleInjectorProvider
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