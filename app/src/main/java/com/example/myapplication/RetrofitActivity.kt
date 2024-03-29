package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.api.ApiInterface
import com.example.myapplication.api.RetrofitClient
import com.google.gson.Gson
import java.lang.Exception

class RetrofitActivity : AppCompatActivity() {

    lateinit var txtData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.retrofit)
        txtData = findViewById(R.id.txtData)
        getUserList()
    }

    fun getUserList() {
        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            try {
                val response = apiInterface.getAllUsers()
                if (response.isSuccessful()) {
                    var json = Gson().toJson(response.body())
                    Log.d("Response", json)
                    if (response.body()?.data?.size!! <= 0) {
                        Toast.makeText(
                            this@RetrofitActivity,
                            "No Data ",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {
                        txtData.setText(json)
                    }

                    //new
                    /* if(response?.body()!!.support.text.contains("Shaurya")){
                         Toast.makeText(
                             this@MainActivity,
                             "Hello Retrofit",
                             Toast.LENGTH_LONG
                         ).show()
                     }*/

                    // var getNEsteddata=response.body().data.get(0).suport.url

                } else {
                    Toast.makeText(
                        this@RetrofitActivity,
                        response.errorBody().toString(),
                        Toast.LENGTH_LONG
                    ).show()
                }
            }catch (Ex:Exception){
                Log.e("Error",Ex.localizedMessage)
            }
        }

    }

}