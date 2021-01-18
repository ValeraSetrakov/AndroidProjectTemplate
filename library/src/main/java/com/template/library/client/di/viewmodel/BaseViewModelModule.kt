package com.template.library.client.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

/**
 * Base module for providing [ViewModelProvider].[Factory]
 */
@Module
abstract class BaseViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<Class<out ViewModel>, ViewModel>
}