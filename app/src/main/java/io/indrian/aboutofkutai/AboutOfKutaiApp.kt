package io.indrian.aboutofkutai

import android.app.Application
import io.indrian.aboutofkutai.di.appModule
import io.indrian.aboutofkutai.di.mvvmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class AboutOfKutaiApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {

            Timber.plant(Timber.DebugTree())
        }

        startKoin {

            androidLogger(Level.DEBUG)
            androidContext(this@AboutOfKutaiApp)
            modules(listOf(
                appModule,
                mvvmModule
            ))
        }
    }
}