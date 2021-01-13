package com.navigation.classic_navigation

import com.navigation.Transport

class ClassicTransport : Transport<ClassicDestination> {

    override fun <FROM_DESTINATION : ClassicDestination, TO_DESTINATION : ClassicDestination> goTo(
        fromDestination: FROM_DESTINATION,
        toDestination: TO_DESTINATION
    ) {
        when (toDestination) {
            is ActivityDestination -> {
                goToActivity(fromDestination, toDestination)
            }
            is FragmentDestination -> {
                goToFragment(fromDestination, toDestination)
            }
        }
    }

    private fun goToActivity(
        fromDestination: ClassicDestination,
        toDestination: ActivityDestination
    ) {
        when (fromDestination) {
            is ActivityDestination -> {
                goToActivityFromActivity(fromDestination, toDestination)
            }
            is FragmentDestination -> {
                goToActivityFromFragment(fromDestination, toDestination)
            }
        }
    }

    private fun goToFragment(
        fromDestination: ClassicDestination,
        toDestination: FragmentDestination
    ) {

        when (fromDestination) {
            is ActivityDestination -> {
                goToFragmentFromActivity(fromDestination, toDestination)
            }
            is FragmentDestination -> {
                goToFragmentFromFragment(fromDestination, toDestination)
            }
        }
    }

    private fun goToActivityFromActivity(
        fromDestination: ActivityDestination,
        toDestination: ActivityDestination
    ) {

    }

    private fun goToFragmentFromActivity(
        fromDestination: ActivityDestination,
        toDestination: FragmentDestination
    ) {

    }

    private fun goToActivityFromFragment(
        fromDestination: FragmentDestination,
        toDestination: ActivityDestination
    ) {

    }

    private fun goToFragmentFromFragment(
        fromDestination: FragmentDestination,
        toDestination: FragmentDestination
    ) {

    }
}

interface ActivityClassicTransport : Transport<ClassicDestination>

interface FragmentClassicTransport : Transport<ClassicDestination>