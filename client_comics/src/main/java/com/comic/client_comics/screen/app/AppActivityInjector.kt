package com.comic.client_comics.screen.app

import com.comic.client.di.ScreenScope
import com.comic.client.di.injector.Injector
import dagger.Module
import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [AppActivityModule::class])
interface AppActivityInjector : Injector<AppActivity> {

    @Subcomponent.Factory
    interface Factory :
        Injector.Factory<AppActivity, AppActivityInjector>
}

@Module
abstract class AppActivityModule