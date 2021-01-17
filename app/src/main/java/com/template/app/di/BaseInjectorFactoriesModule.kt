package com.template.app.di

import com.template.app.features.splash.SplashActivity
import com.template.app.features.splash.SplashActivityInjector
import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorFactoryKey
import com.template.library.client.di.injector.InjectorModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [InjectorModule::class])
abstract class BaseInjectorFactoriesModule {

    @Binds
    @IntoMap
    @InjectorFactoryKey(SplashActivity::class)
    abstract fun bindSplashActivityInjectorFactory(factory: SplashActivityInjector.Factory): Injector.Factory<*, *>
}