package com.comic.app.di

import androidx.fragment.app.FragmentFactory
import com.comic.client.di.fragment.BaseFragmentFactory
import com.comic.screen_marvel.di.MarvelFragmentsModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [MarvelFragmentsModule::class]
)
abstract class BaseFragmentModule {
    @Binds
    abstract fun bindFragmentFactory(
        fragmentFactory: BaseFragmentFactory
    ): FragmentFactory
}