package com.template.app.di

import com.template.app.features.splash.SplashActivityInjector
import dagger.Module

@Module(
    subcomponents = [SplashActivityInjector::class]
)
class SubComponentsModule