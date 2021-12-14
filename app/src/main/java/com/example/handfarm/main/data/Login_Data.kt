package com.example.handfarm.main.data

import com.google.gson.annotations.SerializedName

data class Login_Data( val login : Boolean, //비빌번호 확인
    val data : UserData?){
    data class UserData(
        val me_code : Int,      // 코드
        val me_name : String,   // 이름
        val me_id : String,     // 아이디
        val me_pnum : String,   // 전화번호
        val me_mail : String,   // 이메일
        val me_address : String // 주소
    )
}
data class Login_PUT(
    val me_id : String,
    val me_pw : String
)
