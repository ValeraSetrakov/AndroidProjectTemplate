package com.comic.screen_marvel.di

import androidx.lifecycle.ViewModel
import com.comic.client.di.viewmodel.ViewModelKey
import com.comic.screen_marvel.screen.character.list.ListCharactersViewModel
import com.comic.screen_marvel.screen.main.MainActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MarvelViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ListCharactersViewModel::class)
    abstract fun bindListCharactersViewModel(viewModel: ListCharactersViewModel): ViewModel
}