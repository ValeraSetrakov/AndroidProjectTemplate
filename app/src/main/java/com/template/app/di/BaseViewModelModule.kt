package com.template.app.di

import androidx.lifecycle.ViewModel
import com.template.app.features.splash.SplashActivityViewModel
import com.template.app.features.splash.fragment.SplashFragmentViewModel
import com.template.library.client.di.viewmodel.ViewModelKey
import com.template.library.client.di.viewmodel.ViewModelModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelModule::class])
abstract class BaseViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashActivityViewModel::class)
    abstract fun bindSplashActivityViewModel(viewModel: SplashActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashFragmentViewModel::class)
    abstract fun bindSplashFragmentViewModel(viewModel: SplashFragmentViewModel): ViewModel
}