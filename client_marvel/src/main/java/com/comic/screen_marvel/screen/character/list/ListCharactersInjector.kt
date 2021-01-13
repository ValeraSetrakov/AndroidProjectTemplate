package com.comic.screen_marvel.screen.character.list

import com.comic.client.di.ScreenScope
import com.comic.client.di.injector.Injector
import dagger.Module
import dagger.Subcomponent

@ScreenScope
@Subcomponent(modules = [ListCharactersModule::class])
interface ListCharactersInjector : Injector<ListCharactersFragment> {

    @Subcomponent.Factory
    interface Factory : Injector.Factory<ListCharactersFragment, ListCharactersInjector>
}

@Module
abstract class ListCharactersModule