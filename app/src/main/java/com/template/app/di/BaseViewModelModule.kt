package com.template.app.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.template.app.features.splash.SplashActivityViewModel
import com.template.library.client.di.viewmodel.ViewModelFactory
import com.template.library.client.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds

@Module
abstract class BaseViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<Class<out ViewModel>, ViewModel>

    @Binds
    @IntoMap
    @ViewModelKey(SplashActivityViewModel::class)
    abstract fun bindSplashActivityViewModel(viewModel: SplashActivityViewModel): ViewModel
}