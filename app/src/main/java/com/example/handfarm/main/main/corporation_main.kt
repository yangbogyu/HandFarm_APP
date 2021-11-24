package com.example.handfarm.main

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.R
import com.example.handfarm.adpater.Corporation_Crops_Adpater
import com.example.handfarm.adpater.Corporation_Farm_Adpater
import com.example.handfarm.data.Corporation_Crops_Data
import com.example.handfarm.data.Corporation_Farm_Data
import com.example.handfarm.databinding.CorporationMainBinding
import com.example.handfarm.main.login

class corporation_main : AppCompatActivity(){
    private lateinit var binding: CorporationMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CorporationMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        val farm_Adpa = Corporation_Farm_Adpater(this, farm)
        val crops_Adpa = Corporation_Crops_Adpater(this, crops)


        //뒤로가기 버튼
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // 텃밭 클릭
        binding.viewFarm.setOnClickListener {
            binding.list.adapter = farm_Adpa
            binding.viewFarm.setBackgroundResource(R.drawable.corporation_top_choice)
            binding.cropsView.setBackgroundResource(R.drawable.corporation_top)
            binding.viewBody.setBackgroundResource(R.color.colorBut)
        }


        // 농작물 클릭
        binding.cropsView.setOnClickListener {
            binding.list.adapter = crops_Adpa
            binding.viewFarm.setBackgroundResource(R.drawable.corporation_top)
            binding.cropsView.setBackgroundResource(R.drawable.corporation_top_choice)
            binding.viewBody.setBackgroundResource(R.color.colorBut)
        }

    }

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    val farm = arrayListOf<Corporation_Farm_Data>(
        Corporation_Farm_Data("","XXX","6개월"),
        Corporation_Farm_Data("","ZZZ","6개월"),
        Corporation_Farm_Data("","TTT","12개월")
    )
    val crops = arrayListOf<Corporation_Crops_Data>(
        Corporation_Crops_Data("","당근","2021/01/01"),
        Corporation_Crops_Data("","흙당근","2021/01/01"),
        Corporation_Crops_Data("","토마토","2021/01/01")
    )
}