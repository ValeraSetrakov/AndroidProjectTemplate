package com.comic.app

import android.app.Application
import com.comic.app.di.ApplicationComponent
import com.comic.app.di.ApplicationModule
import com.comic.app.di.DaggerApplicationComponent
import com.comic.client.di.injector.Injector
import com.comic.client.di.injector.InjectorProvider
import com.comic.client.di.injector.InjectorTarget
import javax.inject.Inject

class App : Application(), InjectorProvider {

    @Inject lateinit var injectorProvider: InjectorProvider

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build().also { it.inject(this) }
    }

    override fun <T: InjectorTarget, I : Injector<T>> provide(clazz: Class<T>): I? {
        return injectorProvider.provide(clazz)
    }

    companion object {
        lateinit var applicationComponent: ApplicationComponent
    }
}