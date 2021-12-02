package com.example.handfarm.main.data

import com.google.gson.annotations.SerializedName

data class UserInfo(
    @SerializedName("login")
    val userId: String,
    val followers: Int,
    val following: Int
)
