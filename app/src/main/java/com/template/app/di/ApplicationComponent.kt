package com.template.app.di

import com.template.app.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(target: App)
}