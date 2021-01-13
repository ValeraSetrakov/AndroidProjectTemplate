package com.comic.client_comics.di

import com.comic.client.di.injector.Injector
import com.comic.client.di.injector.InjectorFactoryKey
import com.comic.client_comics.screen.app.AppActivity
import com.comic.client_comics.screen.app.AppActivityInjector
import com.comic.client_comics.screen.splash.SplashActivity
import com.comic.client_comics.screen.splash.SplashActivityInjector
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ClientInjectorsModule {
    @Binds
    @IntoMap
    @InjectorFactoryKey(SplashActivity::class)
    abstract fun bindSplashActivityInjector(factory: SplashActivityInjector.Factory): Injector.Factory<*, *>

    @Binds
    @IntoMap
    @InjectorFactoryKey(AppActivity::class)
    abstract fun bindAppActivityInjector(factory: AppActivityInjector.Factory): Injector.Factory<*, *>
}