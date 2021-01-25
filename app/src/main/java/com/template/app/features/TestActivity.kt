package com.template.app.features

import android.view.LayoutInflater
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.template.app.features.list.ListFragment
import com.template.library.client.screen.BaseActivity
import com.template.screen_marvel.databinding.ActivityTestBinding

class TestActivity :
        BaseActivity<ActivityTestBinding, TestActivityViewModel, TestActivity, TestActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivityTestBinding {
        return ActivityTestBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<TestActivityViewModel> =
            TestActivityViewModel::class.java

    override fun onFirstCreate() {
        super.onFirstCreate()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<ListFragment>(binding.fragmentContainerView.id)
        }
    }
}