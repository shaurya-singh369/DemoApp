package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Activity State ","I am onCreate activity 1")
    }
    override fun onStart()
    {
        super.onStart()
        print("In onStart() function")
        Log.d("Activity State ","I am Onstart activity 1")
    }
    override fun onResume()
    {
        super.onResume()
        print("In onResume() function")
        Log.d("Activity State", "I am Onresume activity 1")

    }
    override fun onPause()
    {
        super.onPause()
        print("Onpause")
        Log.d("Acivity State", "I am OnPause activity 1")
    }
    override fun onStop() {
        super.onStop()
        print("onStop")
        Log.d("Activity State ","I am OnStop activity 1")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
        Log.d("Activity State ","I am onRestart activity 1")

        val intent = Intent(this, MainActivity2::class.java)

        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
        Log.d("Activity State ","I am onDestroy activity 1")
    }

}