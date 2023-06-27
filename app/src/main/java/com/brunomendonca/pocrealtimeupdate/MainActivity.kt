package com.brunomendonca.pocrealtimeupdate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val manager = getSystemService(NOTIFICATION_SERVICE) as? NotificationManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            manager!!.createNotificationChannel(
//                NotificationChannel(
//                    getString(R.string.default_notification_channel_id),
//                    "Default",
//                    NotificationManager.IMPORTANCE_DEFAULT
//                )
//            )
//        }
//
//        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
//            if(task.isSuccessful)
//                Log.d("BRUNOO", "${task.result}")
//            else
//                Log.d("BRUNOO", "${task.exception}")
//        }
    }
}