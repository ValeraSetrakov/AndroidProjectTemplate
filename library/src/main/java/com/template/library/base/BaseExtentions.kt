package com.template.library.base

fun Int?.orDefault(default: Int = 0): Int = this ?: default

fun <T> List<T>?.orDefault(default: List<T> = orEmpty()): List<T> = this ?: default

fun String?.orDefault(default: String = orEmpty()): String = this ?: default

fun <T> Collection<T>.notContains(element: T): Boolean = !contains(element)