package com.example.handfarm.main.data

data class Login_Data(
    val login : List<DataList>,
    //val data : List<DataList>
){
    data class DataList(
        val me_name : String,
        val me_id : String
    )
}
