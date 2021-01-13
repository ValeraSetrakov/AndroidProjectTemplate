package com.comic.screen_marvel.screen.character.list

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.comic.client.screen.viewmodel.FragmentComicViewModel
import javax.inject.Inject

class ListCharactersViewModel @Inject constructor(
    application: Application
) : FragmentComicViewModel(application) {

    val f1 = MutableLiveData<Unit>()

    fun f() {
        val f1 = F1("")
        val f2 = F2(f1)
        f2.l
    }

    interface F {
        val l: String
    }

    class F1(override val l: String) : F

    class F2(val f1: F1) : F by f1
}