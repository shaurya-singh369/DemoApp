package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Activity State ","I am onCreate fragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity State ","I am onstart fragment")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Activity State ","I am onresume fragment")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Activity State ","I am onpause fragment")

    }

}