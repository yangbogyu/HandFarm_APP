package com.example.handfarm.main

import android.widget.Toast
import com.example.handfarm.main.data.Market_Data
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HandFarmSingle {
    var api : API
    var marketlist = arrayListOf<Market_Data.marketList>()
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://13.125.244.167")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }


}