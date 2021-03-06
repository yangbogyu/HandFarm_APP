package com.example.handfarm.main

import android.widget.Toast
import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Market_Data
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HandFarmSingle {
    var api : API
    var marketlist = arrayListOf<Market_Data.marketList>()
    var userData : Login_Data
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://15.164.118.47")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(API::class.java)
        userData = Login_Data(false, null)
    }
}