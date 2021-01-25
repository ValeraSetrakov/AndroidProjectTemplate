package com.template.app.di

import com.template.app.features.TestActivity
import com.template.app.features.TestActivityInjector
import com.template.library.client.di.injector.BaseInjectorModule
import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorFactoryKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseInjectorModule::class])
abstract class InjectorFactoriesModule {

    @Binds
    @IntoMap
    @InjectorFactoryKey(TestActivity::class)
    abstract fun bindSplashActivityInjectorFactory(factory: TestActivityInjector.Factory): Injector.Factory<*, *>
}