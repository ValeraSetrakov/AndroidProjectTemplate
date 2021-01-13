package com.comic.client_comics.screen.splash

import com.comic.client.di.ScreenScope
import com.comic.client.di.injector.Injector
import dagger.Module
import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [SplashActivityModule::class])
interface SplashActivityInjector : Injector<SplashActivity> {

    @Subcomponent.Factory
    interface Factory :
        Injector.Factory<SplashActivity, SplashActivityInjector>
}

@Module
abstract class SplashActivityModule