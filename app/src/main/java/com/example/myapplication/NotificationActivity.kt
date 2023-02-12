package com.example.myapplication

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class NotificationActivity : AppCompatActivity() {
    private final val CHANNEL_ID = "MyChannel"
    private final val NOTIFICATION_ID = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val drawable= getDrawable(R.drawable.message_icon)
        val bitmapDrawable = drawable as BitmapDrawable
        val largeIcon = bitmapDrawable.bitmap
    val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        var notification: Notification
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           notification= Notification.Builder(this)
               .setContentTitle("My notification")
               .setContentText("Hello World!")
               .setSmallIcon(R.drawable.message_icon)
               .setLargeIcon(largeIcon)
               .setChannelId(CHANNEL_ID)
               .build()
           notificationManager.createNotificationChannel(NotificationChannel( CHANNEL_ID,"MyChannel", NotificationManager.IMPORTANCE_HIGH ))
       } else {
           TODO("VERSION.SDK_INT < O")
                 notification=Notification.Builder(this)
               .setContentTitle("My notification")
               .setContentText("Hello World!")
               .setSmallIcon(R.drawable.message_icon)
               .setLargeIcon(largeIcon)
               .build()
       }
        //create a button that on click will notify the user
         val btn = findViewById<Button>(R.id.notify)
        btn.setOnClickListener {
            notificationManager.notify(NOTIFICATION_ID, notification)
        }

    }
}