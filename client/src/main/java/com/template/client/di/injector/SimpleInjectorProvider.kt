package com.template.client.di.injector

import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class SimpleInjectorProvider @Inject constructor(
    private val injectorFactoryProviders: Map<Class<out InjectorTarget>, @JvmSuppressWildcards Provider<Injector.Factory<*, *>>>
): InjectorProvider {

    override fun <T: InjectorTarget, I : Injector<T>> provide(clazz: Class<T>): I? {
        return injectorFactoryProviders[clazz]?.get()?.create() as? I
    }
}