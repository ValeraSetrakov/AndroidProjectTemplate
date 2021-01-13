package com.navigation

import java.util.*

/**
 * Интерфейс, описывающий маршрут, который состоит из [Destination]
 */
abstract class Route<D : Destination> : LinkedList<D>()