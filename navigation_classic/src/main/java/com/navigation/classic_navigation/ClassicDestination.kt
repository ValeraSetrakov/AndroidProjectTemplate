package com.navigation.classic_navigation

import com.navigation.Destination

sealed class ClassicDestination : Destination

class ActivityDestination : ClassicDestination()

class FragmentDestination : ClassicDestination()