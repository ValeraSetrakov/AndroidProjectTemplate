package com.template.app

import com.template.app.di.ApplicationComponent
import com.template.app.di.ApplicationModule
import com.template.app.di.DaggerApplicationComponent
import com.template.library.BaseApp
import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorProvider
import com.template.library.client.di.injector.InjectorTarget
import javax.inject.Inject

class App : BaseApp() {
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