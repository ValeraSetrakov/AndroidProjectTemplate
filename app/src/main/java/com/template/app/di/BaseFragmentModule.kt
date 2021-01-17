package com.template.app.di

import androidx.fragment.app.Fragment
import com.template.app.features.splash.fragment.SplashFragment
import com.template.library.client.di.fragment.FragmentKey
import com.template.library.client.di.fragment.FragmentModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [FragmentModule::class])
abstract class BaseFragmentModule {

    @Binds
    @IntoMap
    @FragmentKey("com.template.app.features.splash.fragment.SplashFragment")
    abstract fun bind(fragment: SplashFragment): Fragment
}