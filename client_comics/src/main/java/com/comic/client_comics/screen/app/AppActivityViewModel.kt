package com.comic.client_comics.screen.app

import android.app.Application
import com.comic.client.screen.viewmodel.ActivityComicViewModel
import javax.inject.Inject

class AppActivityViewModel @Inject constructor(application: Application) :
    ActivityComicViewModel(application)