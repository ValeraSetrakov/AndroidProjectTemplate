package com.template.app.di

import androidx.fragment.app.Fragment
import com.template.app.features.list.ListFragment
import com.template.app.features.test.TestFragment
import com.template.library.client.di.fragment.BaseFragmentModule
import com.template.library.client.di.fragment.FragmentKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseFragmentModule::class])
abstract class FragmentsModule {

    @Binds
    @IntoMap
    @FragmentKey(TestFragment::class)
    abstract fun bindTestFragment(fragment: TestFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(ListFragment::class)
    abstract fun bindListFragment(fragment: ListFragment): Fragment
}