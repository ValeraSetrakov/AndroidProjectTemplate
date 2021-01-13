package com.comic.screen_marvel.screen.main

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.commit
import com.comic.client.screen.ComicActivity
import com.comic.comic_app.databinding.ActivityMainBinding
import com.comic.screen_marvel.screen.character.list.ListCharactersFragment

class MainActivity :
    ComicActivity<ActivityMainBinding, MainActivityViewModel, MainActivity, MainActivityInjector>() {

    override val viewModelClazz: Class<MainActivityViewModel> = MainActivityViewModel::class.java

    override fun createBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                val fragment = supportFragmentManager.fragmentFactory.instantiate(
                    classLoader,
                    ListCharactersFragment::class.java.simpleName
                )
                add(binding.fragmentContainerView.id, fragment)
            }
        }
    }
}