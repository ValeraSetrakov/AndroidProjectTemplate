package com.template.app.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.template.library.client.di.fragment.BaseFragmentFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

@Module
abstract class BaseFragmentModule {
    @Binds
    abstract fun bindFragmentFactory(
        fragmentFactory: BaseFragmentFactory
    ): FragmentFactory

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<String, Fragment>
}