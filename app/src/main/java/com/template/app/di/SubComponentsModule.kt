package com.template.app.di

import com.template.app.features.TestActivityInjector
import dagger.Module

@Module(
        subcomponents = [TestActivityInjector::class]
)
class SubComponentsModule