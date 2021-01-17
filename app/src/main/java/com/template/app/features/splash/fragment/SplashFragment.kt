package com.template.app.features.splash.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.template.library.client.screen.BaseFragment
import com.template.screen_marvel.databinding.FragmentSplashBinding
import javax.inject.Inject

class SplashFragment @Inject constructor(
    viewModelFactory: ViewModelProvider.Factory,
    fragmentFactory: FragmentFactory
) : BaseFragment<FragmentSplashBinding, SplashFragmentViewModel>(
    viewModelFactory,
    fragmentFactory
) {

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, attachToRoot)
    }

    override val viewModelClazz: Class<SplashFragmentViewModel> =
        SplashFragmentViewModel::class.java
}