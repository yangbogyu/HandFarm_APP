package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.R
import com.example.handfarm.adpater.Sharing_Adpater
import com.example.handfarm.data.Sharing_Data
import com.example.handfarm.databinding.SharingMainBinding

class Sharing_Main: AppCompatActivity(){

    private lateinit var binding: SharingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SharingMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // list_view 어뎁터
        val sharing_Adpa = Sharing_Adpater(this, list)
        binding.sharingList.adapter = sharing_Adpa

        // 스피너 선언
        binding.categorySpn.adapter = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item)
        binding.optionSpn.adapter = ArrayAdapter.createFromResource(this, R.array.market_option, android.R.layout.simple_spinner_item)


        // 메인으로 화면이동
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    val list = arrayListOf<Sharing_Data>(
        Sharing_Data("","흙당근",true,"김현아"),
        Sharing_Data("","당근",false,"양보규"),
        Sharing_Data("","작은당근",false,"고명"),
        Sharing_Data("","큰당근",false,"최영환"),
        Sharing_Data("","직접키운당근",true,"김현아")
    )

}