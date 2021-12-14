package com.example.handfarm.main

import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Login_PUT
import com.example.handfarm.main.data.Market_Data
import com.example.handfarm.main.data.UserInfo
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT

interface API {
    @GET("market")
    fun getMarketInfo(): Call<Market_Data>

    @PUT("logins")
    fun getUserInfo(@Body userData : Login_PUT): Call<Login_Data>
}