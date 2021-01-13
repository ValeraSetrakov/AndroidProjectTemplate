package com.comic.client_comics.screen.splash

import android.app.Application
import com.comic.client.screen.viewmodel.ActivityComicViewModel
import javax.inject.Inject

class SplashActivityViewModel @Inject constructor(
    application: Application
) : ActivityComicViewModel(application)