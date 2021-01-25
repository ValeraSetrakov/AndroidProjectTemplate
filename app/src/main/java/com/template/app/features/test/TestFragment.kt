package com.template.app.features.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.template.library.client.screen.BaseFragment
import com.template.screen_marvel.databinding.FragmentTestBinding
import javax.inject.Inject

class TestFragment @Inject constructor(
        viewModelFactory: ViewModelProvider.Factory,
        fragmentFactory: FragmentFactory
) : BaseFragment<FragmentTestBinding, TestFragmentViewModel>(
        viewModelFactory,
        fragmentFactory
) {

    override fun createBinding(
            inflater: LayoutInflater,
            container: ViewGroup?,
            attachToRoot: Boolean
    ): FragmentTestBinding {
        return FragmentTestBinding.inflate(inflater, container, attachToRoot)
    }

    override val viewModelClazz: Class<TestFragmentViewModel> =
            TestFragmentViewModel::class.java
}