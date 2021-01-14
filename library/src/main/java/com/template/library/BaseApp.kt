package com.template.library

import android.app.Application
import com.template.client.di.injector.Injector
import com.template.client.di.injector.InjectorProvider
import com.template.client.di.injector.InjectorTarget
import com.template.library.di.ApplicationComponent
import com.template.library.di.ApplicationModule
import com.template.library.di.DaggerApplicationComponent
import javax.inject.Inject

abstract class BaseApp : Application(), InjectorProvider {

    @Inject
    lateinit var injectorProvider: InjectorProvider

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build().also { it.inject(this) }
    }

    override fun <T : InjectorTarget, I : Injector<T>> provide(clazz: Class<T>): I? {
        return injectorProvider.provide(clazz)
    }

    companion object {
        lateinit var applicationComponent: ApplicationComponent
    }
}