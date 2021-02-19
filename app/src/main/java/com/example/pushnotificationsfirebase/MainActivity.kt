package com.example.pushnotificationsfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notification()
    }

    fun notification(){
        // obtain token to send notification a user specifyc
        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener {
            it.result?.token.let {
                println("this is device token ${it}")
            }
        }

        // user subscribe to group
        FirebaseMessaging.getInstance().subscribeToTopic("GrupUsers")
    }


}