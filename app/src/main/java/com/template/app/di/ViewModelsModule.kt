package com.template.app.di

import androidx.lifecycle.ViewModel
import com.template.app.features.TestActivityViewModel
import com.template.app.features.list.ListFragmentViewModel
import com.template.app.features.test.TestFragmentViewModel
import com.template.library.client.di.viewmodel.BaseViewModelModule
import com.template.library.client.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseViewModelModule::class])
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(TestActivityViewModel::class)
    abstract fun bindTestActivityViewModel(viewModel: TestActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TestFragmentViewModel::class)
    abstract fun bindTestFragmentViewModel(viewModel: TestFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ListFragmentViewModel::class)
    abstract fun bindListFragmentViewModel(viewModel: ListFragmentViewModel): ViewModel
}