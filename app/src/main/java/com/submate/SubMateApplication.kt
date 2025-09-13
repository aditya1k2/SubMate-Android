package com.submate

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SubMateApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}