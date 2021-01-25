package com.template.app.features

import com.template.library.client.di.ActivityScope
import com.template.library.client.di.injector.Injector
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface TestActivityInjector : Injector<TestActivity> {

    @Subcomponent.Factory
    interface Factory : Injector.Factory<TestActivity, TestActivityInjector>
}