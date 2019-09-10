package io.indrian.aboutofkutai.di

import io.indrian.aboutofkutai.data.repositories.Repository
import io.indrian.aboutofkutai.data.service.AboutKutaiService
import io.indrian.aboutofkutai.screens.detail.DetailVM
import io.indrian.aboutofkutai.screens.main.fragments.AboutsKutaiVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { AboutKutaiService() }
    single { Repository(get()) }
}

val mvvmModule = module {

    viewModel { AboutsKutaiVM(get()) }
    viewModel { DetailVM(get()) }
}