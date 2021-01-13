package com.comic.screen_marvel.screen.main

import android.app.Application
import com.comic.client.screen.viewmodel.ActivityComicViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(application: Application) :
    ActivityComicViewModel(application)