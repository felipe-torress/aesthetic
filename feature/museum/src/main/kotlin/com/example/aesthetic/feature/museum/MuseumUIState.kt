package com.example.aesthetic.feature.museum

sealed interface MuseumUIState {
    object Loading : MuseumUIState
    object Success : MuseumUIState
}