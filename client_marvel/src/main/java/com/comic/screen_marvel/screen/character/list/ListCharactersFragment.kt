package com.comic.screen_marvel.screen.character.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.comic.client.screen.ComicFragment
import com.comic.comic_app.databinding.FragmentListCharactersBinding
import javax.inject.Inject

class ListCharactersFragment @Inject constructor(
    viewModelFactory: ViewModelProvider.Factory,
    fragmentFactory: FragmentFactory
) : ComicFragment<FragmentListCharactersBinding, ListCharactersViewModel, ListCharactersFragment, ListCharactersInjector>(
    viewModelFactory, fragmentFactory
) {

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean
    ): FragmentListCharactersBinding {
        return FragmentListCharactersBinding.inflate(inflater, container, attachToRoot)
    }

    override val viewModelClazz: Class<ListCharactersViewModel> =
        ListCharactersViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listen()
        observe()
    }

    private fun listen() {
        binding.swipeToRefreshCharacters.setOnRefreshListener {
        }
    }

    private fun observe() {
    }

    private fun render(state: ListCharactersFragmentState) {
        when (state) {
            is ListCharactersFragmentState.LoadState -> renderLoadState(state)
            is ListCharactersFragmentState.DataState -> renderDataState(state)
            is ListCharactersFragmentState.ErrorState -> renderErrorState(state)
        }
    }

    private fun renderLoadState(state: ListCharactersFragmentState.LoadState) {
        when (state) {
            is ListCharactersFragmentState.LoadState.StartLoadState -> renderStartLoadState(state)
            is ListCharactersFragmentState.LoadState.MoreLoadState -> renderMoreLoadState(state)
            is ListCharactersFragmentState.LoadState.ReloadState -> renderReloadState(state)
        }
    }

    private fun renderStartLoadState(state: ListCharactersFragmentState.LoadState.StartLoadState) {

    }

    private fun renderMoreLoadState(state: ListCharactersFragmentState.LoadState.MoreLoadState) {

    }

    private fun renderReloadState(state: ListCharactersFragmentState.LoadState.ReloadState) {

    }

    private fun renderDataState(state: ListCharactersFragmentState.DataState) {

    }

    private fun renderErrorState(state: ListCharactersFragmentState.ErrorState) {

    }
}