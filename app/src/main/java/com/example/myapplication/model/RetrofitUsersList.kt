package com.example.myapplication.model

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName

data class RetrofitUsersList(

    @SerializedName("data")
var data: List<Data>,
    @SerializedName("page")
var page: Int,
    @SerializedName("per_page")
var perPage: Int,
    @SerializedName("support")
var support: Support,
    @SerializedName("total")
var total: Int,
    @SerializedName(
    "total_pages")
var totalPages: Int

)
