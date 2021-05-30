package com.alinecruz.devweek.di

import com.alinecruz.devweek.presentation.viewmodel.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val availableServiceModule = module {

    viewModel {
        HomeViewModel()
    }

}


val loadAvailableServicesModule by lazy { loadKoinModules(availableServiceModule) }

fun injectAvailableServicesModule() = loadAvailableServicesModule