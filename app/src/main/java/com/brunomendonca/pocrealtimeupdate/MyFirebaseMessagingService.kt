package com.brunomendonca.pocrealtimeupdate

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("BRUNOO", "TOKEN $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.d("BRUNOO", "MESSAGE AAAAAA")
        Log.d("BRUNOO", "MESSAGE ${message.data}")
        Log.d("BRUNOO", "MESSAGE ${message.senderId}")
        Log.d("BRUNOO", "MESSAGE ${message}")
    }
}