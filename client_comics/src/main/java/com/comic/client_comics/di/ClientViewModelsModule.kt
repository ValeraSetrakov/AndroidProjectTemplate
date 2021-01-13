package com.comic.client_comics.di

import androidx.lifecycle.ViewModel
import com.comic.client.di.viewmodel.ViewModelKey
import com.comic.client_comics.screen.app.AppActivityViewModel
import com.comic.client_comics.screen.splash.SplashActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ClientViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashActivityViewModel::class)
    abstract fun bindSplashActivityViewModel(viewModel: SplashActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AppActivityViewModel::class)
    abstract fun bindAppActivityViewModel(viewModel: AppActivityViewModel): ViewModel
}