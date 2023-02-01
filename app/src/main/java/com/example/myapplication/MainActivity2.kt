package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("Activity State ","I am onCreate activity 2")
    }
    override fun onStart()
    {
        super.onStart()
        print("In onStart() function")
        Log.d("Activity State ","I am Onstart activity 2")
    }
    override fun onResume()
    {
        super.onResume()
        print("In onResume() function")
        Log.d("Activity State", "I am Onresume activity 2")
    }
    override fun onPause()
    {
        super.onPause()
        print("Onpause")
        Log.d("Acivity State", "I am OnPause activity 2")
    }
    override fun onStop() {
        super.onStop()
        print("onStop")
        Log.d("Activity State ","I am OnStop activity 2")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
        Log.d("Activity State ","I am onRestart activity 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
        Log.d("Activity State ","I am onDestroy activity 2")
    }
}