package com.template.library.client.di.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * Factory for creation fragments with DI helping
 */
@Singleton
class BaseFragmentFactory @Inject constructor(
        val fragmentsMaps: Map<Class<out Fragment>, @JvmSuppressWildcards Provider<Fragment>>
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return kotlin.runCatching {
            val cl = Class.forName(className)
            fragmentsMaps[cl]?.get() ?: super.instantiate(classLoader, className)
        }.fold(
            { it },
            { super.instantiate(classLoader, className) }
        )
    }
}