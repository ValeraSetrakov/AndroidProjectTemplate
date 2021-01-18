package com.template.app.di

import androidx.fragment.app.Fragment
import com.template.app.features.splash.fragment.SplashFragment
import com.template.library.client.di.fragment.BaseFragmentModule
import com.template.library.client.di.fragment.FragmentKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseFragmentModule::class])
abstract class FragmentsModule {

    @Binds
    @IntoMap
    @FragmentKey(SplashFragment::class)
    abstract fun bind(fragment: SplashFragment): Fragment
}