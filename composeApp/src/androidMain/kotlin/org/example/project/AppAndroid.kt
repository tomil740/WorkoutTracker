package org.example.project

import android.app.Application
import android.content.Context
import org.example.project.workoutTracker.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class AppAndroid:Application() {
    init {
        instance = this
    }
    companion object {
        private var instance: AppAndroid? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }



    override fun onCreate() {
        super.onCreate()

        val context: Context = AppAndroid.applicationContext()


        startKoin {

            androidContext(this@AppAndroid)

            modules(AppModule)
        }
    }


}