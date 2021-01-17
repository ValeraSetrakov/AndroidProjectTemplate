package com.template.library.client.di.injector

import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

/**
 * Base module for providing [Injector].[Factory]
 */
@Module
abstract class InjectorModule {
    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<Class<out InjectorTarget>, Injector.Factory<*, *>>
}