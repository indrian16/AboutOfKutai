package io.indrian.aboutofkutai.screens.detail

import io.indrian.aboutofkutai.data.model.AboutKutai

sealed class DetailState {

    data class Loaded(val aboutKutai: AboutKutai): DetailState()

    object Loading: DetailState()

    data class Error(val throwable: Throwable): DetailState()
}