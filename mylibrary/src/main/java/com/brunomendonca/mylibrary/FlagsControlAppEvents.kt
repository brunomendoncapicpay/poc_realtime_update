package com.brunomendonca.mylibrary

import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.RemoteMessage

object FlagsControlAppEvents {

    fun notifyOnAppCreated() {
        FirebaseMessaging.getInstance().subscribeToTopic("houstonclient").addOnCompleteListener { task ->
            if(task.isSuccessful)
                Log.d("BRUNOO", "TOPIC SUCCESS")
            else
                Log.d("BRUNOO", "TOPIC FAILED")
        }
    }

    fun notifyOnAppTerminated() {
        FirebaseMessaging.getInstance().unsubscribeFromTopic("houstonclient").addOnCompleteListener { task ->
            if(task.isSuccessful)
                Log.d("BRUNOO", "TOPIC SUCCESS")
            else
                Log.d("BRUNOO", "TOPIC FAILED")
        }
    }

    fun notifyOnMessageReceived(message: RemoteMessage) {

    }

}