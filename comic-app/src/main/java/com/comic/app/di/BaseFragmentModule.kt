package com.comic.app.di

import androidx.fragment.app.FragmentFactory
import com.comic.client.di.fragment.BaseFragmentFactory
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