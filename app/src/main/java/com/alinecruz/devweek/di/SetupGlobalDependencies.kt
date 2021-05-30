package com.alinecruz.devweek.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

class SetupGlobalDependencies (private val applicationContext: Context) {

    private val appModule = module {
        availableServiceModule
    }

    fun init(){
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(applicationContext)
            modules(
                    arrayListOf(
                            appModule
                    )
            )

        }
    }
}