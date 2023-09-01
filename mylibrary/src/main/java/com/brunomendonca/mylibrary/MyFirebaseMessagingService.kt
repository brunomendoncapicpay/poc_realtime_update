package com.brunomendonca.mylibrary

//import android.util.Log
//import com.google.firebase.ktx.Firebase
//import com.google.firebase.ktx.app
//import com.google.firebase.messaging.FirebaseMessaging
//import com.google.firebase.messaging.FirebaseMessagingService
//import com.google.firebase.messaging.RemoteMessage
//import com.google.firebase.messaging.ktx.messaging
//
//class MyFirebaseMessagingService: FirebaseMessagingService() {
//    override fun onNewToken(token: String) {
//        super.onNewToken(token)
//        Log.d("BRUNOO", "TOKEN $token")
//        val houstonApp = Firebase.app("houston")
//    }
//
//    override fun onMessageReceived(message: RemoteMessage) {
//        super.onMessageReceived(message)
//        Log.d("BRUNOO", "MESSAGE ${message.data}")
//        Log.d("BRUNOO", "MESSAGE ${message.senderId}")
//        Log.d("BRUNOO", "MESSAGE ${message}")
//    }
//}