package com.comic.client.di.injector

/**
 * Interface for classes that can provide injectors for another classes
 */
interface InjectorProvider {
    fun <T: InjectorTarget, I: Injector<T>> provide(clazz: Class<T>): I?
}