package com.comic.screen_marvel.screen.character.list

import com.comic.domain.character.Character

sealed class ListCharactersFragmentState(
    val characters: List<Character>
) {

    sealed class LoadState(characters: List<Character>) : ListCharactersFragmentState(characters) {

        object StartLoadState : LoadState(emptyList())
        class MoreLoadState(characters: List<Character>) : LoadState(characters)
        class ReloadState(characters: List<Character>) : LoadState(characters)
    }

    class DataState(characters: List<Character>) : ListCharactersFragmentState(characters)

    class ErrorState(characters: List<Character>) : ListCharactersFragmentState(characters)
}