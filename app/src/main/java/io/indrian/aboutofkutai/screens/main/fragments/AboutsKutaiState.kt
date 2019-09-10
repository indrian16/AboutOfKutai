package io.indrian.aboutofkutai.screens.main.fragments

import io.indrian.aboutofkutai.data.model.AboutKutai

sealed class AboutsKutaiState {

    data class LoadedAbouts(
        val abouts: List<AboutKutai>
    ): AboutsKutaiState()

    object Loading: AboutsKutaiState()

    data class Error(
        val throwable: Throwable
    ): AboutsKutaiState()
}