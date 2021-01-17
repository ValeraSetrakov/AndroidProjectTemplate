package com.template.app.features.splash.fragment

import android.app.Application
import com.template.library.client.screen.viewmodel.FragmentBaseViewModel
import javax.inject.Inject

class SplashFragmentViewModel @Inject constructor(application: Application) :
    FragmentBaseViewModel(application)