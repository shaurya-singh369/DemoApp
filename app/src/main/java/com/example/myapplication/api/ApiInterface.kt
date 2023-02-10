package com.example.myapplication.api

import com.example.myapplication.model.RetrofitUsersList
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/users?page=2")
    suspend fun getAllUsers(): Response<RetrofitUsersList>
}