package com.comic.screen_marvel.screen.main

import com.comic.client.di.ScreenScope
import com.comic.client.di.injector.Injector
import dagger.Module
import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityInjector :
    Injector<MainActivity> {

    @Subcomponent.Factory
    interface Factory:
        Injector.Factory<MainActivity, MainActivityInjector>
}

@Module
abstract class MainActivityModule