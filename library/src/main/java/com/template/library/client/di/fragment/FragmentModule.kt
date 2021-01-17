package com.template.library.client.di.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.Multibinds

/**
 * Base module for providing [ViewModelProvider].[Factory]
 */
@Module
abstract class FragmentModule {
    @Binds
    abstract fun bindFragmentFactory(
            fragmentFactory: BaseFragmentFactory
    ): FragmentFactory

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<String, Fragment>
}