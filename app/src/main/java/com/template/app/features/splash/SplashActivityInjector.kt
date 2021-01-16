package com.template.app.features.splash

import com.template.library.client.di.ActivityScope
import com.template.library.client.di.injector.Injector
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SplashActivityInjector : Injector<SplashActivity> {

    @Subcomponent.Factory
    interface Factory : Injector.Factory<SplashActivity, SplashActivityInjector>
}