package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnStart.setOnClickListener{
                val intent = Intent(this@MainActivity2,MyService::class.java)
                startService(intent)
            }
            btnStop.setOnClickListener{
                val intent = Intent(this@MainActivity2,MyService::class.java)
                stopService(intent)
            }
        }
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