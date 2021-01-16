package com.template.app.features.splash

import android.app.Application
import com.template.library.client.screen.viewmodel.ActivityBaseViewModel
import javax.inject.Inject

class SplashActivityViewModel @Inject constructor(
    application: Application
) : ActivityBaseViewModel(application)