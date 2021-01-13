package com.comic.app.di

import androidx.lifecycle.ViewModelProvider
import com.comic.client.di.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module(
    includes = []
)
abstract class BaseViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}