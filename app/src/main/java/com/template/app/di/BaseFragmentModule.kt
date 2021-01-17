package com.template.app.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.template.app.features.splash.fragment.SplashFragment
import com.template.library.client.di.fragment.BaseFragmentFactory
import com.template.library.client.di.fragment.FragmentKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds

@Module
abstract class BaseFragmentModule {
    @Binds
    abstract fun bindFragmentFactory(
        fragmentFactory: BaseFragmentFactory
    ): FragmentFactory

    @Multibinds
    abstract fun emptyInjectorsMap(): Map<String, Fragment>

    @Binds
    @IntoMap
    @FragmentKey("com.template.app.features.splash.fragment.SplashFragment")
    abstract fun bind(fragment: SplashFragment): Fragment
}