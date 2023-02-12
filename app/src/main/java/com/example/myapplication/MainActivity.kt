package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, NotificationActivity::class.java)
        startActivity(intent)
        Log.d("Activity State ", "I am onCreate activity 1")
        //        GlobalScope.launch {
//            val time = measureTimeMillis {
//                val one = sampleOne()
//                val two = sampleTwo()
//                Log.d("Activity State ","The answer is ${one + two}")
//
//            }
//            Log.d("Activity State ","Completed in $time ms")
//
//        }
//        Log.d("Activity State ","EOF")
       GlobalScope.launch{
           execute()
       }


    }
    private suspend fun execute() {


        val parentJob = GlobalScope.launch(Dispatchers.Main) {
            Log.d("coroutine", "parent job started")
            val childJob = launch(Dispatchers.IO) {
                Log.d("coroutine", "child job started")
                delay(1000L)
                Log.d("coroutine", "child job finished")
            }
            delay(3000L)
            Log.d("coroutine", "parent job finished")
        }
        parentJob.join()
        Log.d("coroutine", "Parent Completed")
    }
    private suspend fun sampleOne(): Int {
        Log.d("Activity State ","sampleOne"+System.currentTimeMillis())
        delay(1000L)
        return 10
    }

    private suspend fun sampleTwo(): Int {
        Log.d("Activity State ","sampleTwo"+System.currentTimeMillis())
        delay(1000L)
        return 10
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