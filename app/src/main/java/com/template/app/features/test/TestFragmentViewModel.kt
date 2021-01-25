package com.template.app.features.test

import android.app.Application
import com.template.library.client.screen.viewmodel.FragmentBaseViewModel
import javax.inject.Inject

class TestFragmentViewModel @Inject constructor(application: Application) :
        FragmentBaseViewModel(application)