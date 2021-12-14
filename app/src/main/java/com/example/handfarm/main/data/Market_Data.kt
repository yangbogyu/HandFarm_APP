package com.example.handfarm.main.data

data class Market_Data(val market : List<marketList>){
    data class marketList(
        val product_code : Int,             // 등록번호
        val product_name : String,          // 타이틀
        val product_price : String,         // 단위당 가격
        val product_amount : String,        // 단위
        val product_sell : String,          // 총 판매 수량
        val product_explanation : String,   // 소개
        val product_redate : String,        // 등록일자
        val me_name : String,               // 판매자 이름
        val crop_variety : String           // 구분
    )
}