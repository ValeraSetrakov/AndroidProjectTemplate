package com.template.library.client.screen.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

/**
 * Base view model for all screens (fragments and activities)
 */
abstract class BaseViewModel(application: Application) : AndroidViewModel(application)

/**
 * Base view model for all activities
 */
abstract class ActivityBaseViewModel(application: Application) : BaseViewModel(application)

/**
 * Base view model for all fragments
 */
abstract class FragmentBaseViewModel(application: Application) : BaseViewModel(application)