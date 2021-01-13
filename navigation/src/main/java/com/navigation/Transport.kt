package com.navigation

import com.comic.base.notContains

/**
 * Интерфейс для перехода между экранами
 */
interface Transport<D : Destination> {
    fun <FROM_DESTINATION : D, TO_DESTINATION : D> goTo(
        fromDestination: FROM_DESTINATION,
        toDestination: TO_DESTINATION
    )
}

class RouteTransport<D : Destination>(
    private val route: Route<D>,
    private val transport: Transport<D>
) : Transport<D> by transport {

    var currentDestination: D = route.first

    override fun <FROM_DESTINATION : D, TO_DESTINATION : D> goTo(
        fromDestination: FROM_DESTINATION,
        toDestination: TO_DESTINATION
    ) {

        if (route.notContains(fromDestination)) {
            error("From destination need be contains in route")
        }

        if (route.notContains(toDestination)) {
            error("To destination need be contains in route")
        }

        if (currentDestination != fromDestination) {
            error("Current destination need be same like from destination")
        }

        transport.goTo(fromDestination, toDestination)
        currentDestination = toDestination
    }

    fun <TO_DESTINATION : D> goTo(toDestination: TO_DESTINATION) {
        goTo(currentDestination, toDestination)
    }

    fun go() {
        goTo(route.last)
    }
}