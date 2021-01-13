package com.comic.screen_marvel.screen.character.list

sealed class ListCharactersFragmentEvent(
    val state: ListCharactersFragmentState
) {

    class LoadEvent(state: ListCharactersFragmentState) : ListCharactersFragmentEvent(state)
}