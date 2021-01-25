package com.template.app.features

import android.app.Application
import com.template.library.client.screen.viewmodel.ActivityBaseViewModel
import javax.inject.Inject

class TestActivityViewModel @Inject constructor(
        application: Application
) : ActivityBaseViewModel(application)