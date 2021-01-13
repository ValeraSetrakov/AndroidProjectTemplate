package com.comic.app.di

import androidx.lifecycle.ViewModelProvider
import com.comic.client.di.viewmodel.ViewModelFactory
import com.comic.client_comics.di.ClientViewModelsModule
import com.comic.screen_marvel.di.MarvelViewModelsModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        ClientViewModelsModule::class,
        MarvelViewModelsModule::class
    ]
)
abstract class BaseViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}