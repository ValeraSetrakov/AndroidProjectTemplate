package com.template.app.features.list

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.template.library.client.screen.viewmodel.FragmentBaseViewModel
import com.template.library.client.screen.viewmodel.toLiveData
import javax.inject.Inject

class ListFragmentViewModel @Inject constructor(
    application: Application
) : FragmentBaseViewModel(application) {

    private val mutableItems = MutableLiveData<Pair<List<Item1>, List<Item2>>>()
    val items: LiveData<Pair<List<Item1>, List<Item2>>> = mutableItems.toLiveData()

    fun generateItems() {
        val items1 = listOf<Item1>(Item1("Title 1"), Item1("Title 2"), Item1("Title 3"))
        val items2 = listOf<Item2>(
            Item2("Title 1", "Message 1"),
            Item2("Title 2", "Message 2"),
            Item2("Title 3", "Message 3")
        )
        mutableItems.value = items1 to items2
    }
}