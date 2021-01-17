package com.template.app.features.splash

import android.view.LayoutInflater
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.template.app.features.splash.fragment.SplashFragment
import com.template.library.client.screen.BaseActivity
import com.template.screen_marvel.databinding.ActivitySplashBinding

class SplashActivity :
    BaseActivity<ActivitySplashBinding, SplashActivityViewModel, SplashActivity, SplashActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<SplashActivityViewModel> =
            SplashActivityViewModel::class.java

    override fun onFirstCreate() {
        super.onFirstCreate()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<SplashFragment>(binding.fragmentContainerView.id)
        }
    }
}