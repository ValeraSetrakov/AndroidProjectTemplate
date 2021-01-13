package com.template.app.di

import androidx.fragment.app.FragmentFactory
import com.template.client.di.fragment.BaseFragmentFactory
import dagger.Binds
import dagger.Module

@Module(
    includes = []
)
abstract class BaseFragmentModule {
    @Binds
    abstract fun bindFragmentFactory(
        fragmentFactory: BaseFragmentFactory
    ): FragmentFactory
}