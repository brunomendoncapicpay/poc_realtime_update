package com.brunomendonca.pocrealtimeupdate

import android.app.Application
import com.brunomendonca.mylibrary.FlagsControlAppEvents

class AppDelegate : Application() {
    override fun onCreate() {
        super.onCreate()
        FlagsControlAppEvents.notifyOnAppCreated()
    }

    override fun onTerminate() {
        super.onTerminate()
        FlagsControlAppEvents.notifyOnAppTerminated()
    }
}