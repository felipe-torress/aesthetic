package com.example.aesthetic.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.aesthetic.feature.museum.R as museumR
import com.example.aesthetic.feature.profile.R as profileR
import com.example.aesthetic.core.designsystem.icon.AestheticIcons

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    MUSEUM(
        selectedIcon = AestheticIcons.AddSelected,
        unselectedIcon = AestheticIcons.AddUnselected,
        iconTextId = museumR.string.feature_museum_title,
        titleTextId = museumR.string.feature_museum_title,
    ),
    PROFILE(
        selectedIcon = AestheticIcons.PersonSelected,
        unselectedIcon = AestheticIcons.PersonUnselected,
        iconTextId = profileR.string.feature_profile_title,
        titleTextId = profileR.string.feature_profile_title,
    )
}
