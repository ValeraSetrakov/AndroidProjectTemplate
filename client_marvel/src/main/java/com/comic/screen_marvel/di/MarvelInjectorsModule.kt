package com.comic.screen_marvel.di

import com.comic.client.di.injector.Injector
import com.comic.client.di.injector.InjectorFactoryKey
import com.comic.screen_marvel.screen.character.list.ListCharactersFragment
import com.comic.screen_marvel.screen.character.list.ListCharactersInjector
import com.comic.screen_marvel.screen.main.MainActivity
import com.comic.screen_marvel.screen.main.MainActivityInjector
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MarvelInjectorsModule {

    @Binds
    @IntoMap
    @InjectorFactoryKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(factory: MainActivityInjector.Factory): Injector.Factory<*, *>

    @Binds
    @IntoMap
    @InjectorFactoryKey(ListCharactersFragment::class)
    abstract fun bindListCharactersInjectorFactory(factory: ListCharactersInjector.Factory): Injector.Factory<*, *>
}