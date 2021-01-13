package com.comic.screen_marvel.di

import androidx.fragment.app.Fragment
import com.comic.client.di.fragment.FragmentKey
import com.comic.screen_marvel.screen.character.list.ListCharactersFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MarvelFragmentsModule {
    @Binds
    @IntoMap
    @FragmentKey("ListCharactersFragment")
    abstract fun bindListCharactersFragment(
        fragment: ListCharactersFragment
    ): Fragment
}