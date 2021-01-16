package com.template.app.di

import com.template.app.features.splash.SplashActivity
import com.template.app.features.splash.SplashActivityInjector
import com.template.library.client.di.injector.*
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds

@Module
abstract class BaseInjectorFactoriesModule {

    @Binds
    abstract fun bindInjectorProvider(injectorProvider: SimpleInjectorProvider): InjectorProvider

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<Class<out InjectorTarget>, Injector.Factory<*, *>>

    @Binds
    @IntoMap
    @InjectorFactoryKey(SplashActivity::class)
    abstract fun bindSplashActivityInjectorFactory(factory: SplashActivityInjector.Factory): Injector.Factory<*, *>
}