package com.comic.client_comics.screen.app

import android.view.LayoutInflater
import com.comic.client.screen.ComicActivity
import com.comic.client_comics.databinding.ActivityAppBinding

class AppActivity :
    ComicActivity<ActivityAppBinding, AppActivityViewModel, AppActivity, AppActivityInjector>() {

    override fun createBinding(inflater: LayoutInflater): ActivityAppBinding {
        return ActivityAppBinding.inflate(inflater)
    }

    override val viewModelClazz: Class<AppActivityViewModel>
        get() = AppActivityViewModel::class.java
}