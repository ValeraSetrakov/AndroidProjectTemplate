package com.comic.client.screen.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

/**
 * Base view model for all screens (fragments and activities)
 */
abstract class ComicViewModel(application: Application) : AndroidViewModel(application)

/**
 * Base view model for all activities
 */
abstract class ActivityComicViewModel(application: Application) : ComicViewModel(application)

/**
 * Base view model for all fragments
 */
abstract class FragmentComicViewModel(application: Application) : ComicViewModel(application)