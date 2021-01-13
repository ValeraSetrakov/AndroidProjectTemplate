package com.comic.client.di.injector

interface InjectorTarget

/**
 * Base interface for injecting to target object
 */
interface Injector <in T: InjectorTarget> {

    fun inject(target: T)

    interface Factory<in T: InjectorTarget, out I: Injector<T>> {
        fun create(): I
    }
}