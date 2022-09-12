package com.yutai.business.ugee

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UgeeApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}