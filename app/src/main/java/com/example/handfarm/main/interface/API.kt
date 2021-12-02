package com.example.handfarm.main

import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Market_Data
import com.example.handfarm.main.data.UserInfo
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("market")
    fun getUserInfo(): Call<Market_Data>
}