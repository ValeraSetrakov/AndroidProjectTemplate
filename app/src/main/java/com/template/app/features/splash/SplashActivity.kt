package com.template.app.features.splash

import android.view.LayoutInflater
import com.template.library.client.screen.BaseActivity
import com.template.screen_marvel.databinding.ActivitySplashBinding

class SplashActivity :
    BaseActivity<ActivitySplashBinding, SplashActivityViewModel, SplashActivity, SplashActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<SplashActivityViewModel> =
        SplashActivityViewModel::class.java
}