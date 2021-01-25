package com.template.app.features

import android.view.LayoutInflater
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.template.app.features.test.TestFragment
import com.template.library.client.screen.BaseActivity
import com.template.screen_marvel.databinding.ActivitySplashBinding

class TestActivity :
        BaseActivity<ActivitySplashBinding, TestActivityViewModel, TestActivity, TestActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<TestActivityViewModel> =
            TestActivityViewModel::class.java

    override fun onFirstCreate() {
        super.onFirstCreate()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<TestFragment>(binding.fragmentContainerView.id)
        }
    }
}