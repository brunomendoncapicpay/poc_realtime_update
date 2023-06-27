package com.brunomendonca.mylibrary

import com.google.firebase.messaging.FirebaseMessaging

class MyFirebaseMessagingSubscriber {
    init {
        FirebaseMessaging.getInstance().subscribeToTopic("houstonclient").addOnSuccessListener {

        }
    }
}