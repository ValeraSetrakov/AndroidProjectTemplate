package com.comic.app.di

import com.comic.client_comics.screen.app.AppActivityInjector
import com.comic.client_comics.screen.splash.SplashActivityInjector
import com.comic.screen_marvel.screen.character.list.ListCharactersInjector
import com.comic.screen_marvel.screen.main.MainActivityInjector
import dagger.Module

@Module(
    subcomponents = [
        SplashActivityInjector::class,
        AppActivityInjector::class,
        MainActivityInjector::class,
        ListCharactersInjector::class
    ]
)
class SubComponentsModule