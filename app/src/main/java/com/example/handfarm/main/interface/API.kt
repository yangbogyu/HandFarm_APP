package com.example.handfarm.main

import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Login_PUT
import com.example.handfarm.main.data.Market_Data
import com.example.handfarm.main.data.UserInfo
import retrofit2.Call
import retrofit2.http.*

interface API {
    @GET("market")
    @Headers("accept: application/json",
        "content-type: application/json")
    fun getMarketInfo(): Call<Market_Data>

    @PUT("logins")
    @Headers("accept: application/json",
        "content-type: application/json")
    fun LoginPUT(
        @Body userData : Login_PUT
    ): Call<Login_Data>
}