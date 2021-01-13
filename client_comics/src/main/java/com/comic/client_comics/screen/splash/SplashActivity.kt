package com.comic.client_comics.screen.splash

import android.os.Bundle
import android.view.LayoutInflater
import com.comic.client.screen.ComicActivity
import com.comic.client_comics.databinding.ActivitySplashBinding

class SplashActivity :
    ComicActivity<ActivitySplashBinding, SplashActivityViewModel, SplashActivity, SplashActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<SplashActivityViewModel>
        get() = SplashActivityViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}