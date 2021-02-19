package com.example.pushnotificationsfirebase

import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        Handler(Looper.getMainLooper()).postDelayed({
            // Your Code
            Toast.makeText(baseContext, "Notification on foreground", Toast.LENGTH_LONG).show()
        }, 3000)

    }




}