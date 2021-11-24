package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.R
import com.example.handfarm.adpater.Palm_Adpater
import com.example.handfarm.data.Palm_Data
import com.example.handfarm.databinding.PalmMainBinding

class Palm_Main: AppCompatActivity() {

    private lateinit var binding: PalmMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PalmMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // list_view 어뎁터
        val palm_Adpa = Palm_Adpater(this, list)
        binding.palmList.adapter = palm_Adpa

        // 스피너 선언
        binding.provinceSpn.adapter = ArrayAdapter.createFromResource(this, R.array.province, android.R.layout.simple_spinner_item)
        binding.citySpn.adapter = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_item)
        binding.periodSpn.adapter = ArrayAdapter.createFromResource(this, R.array.period, android.R.layout.simple_spinner_item)


        // 메인으로 화면이동
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    val list = arrayListOf<Palm_Data>(
        Palm_Data("","위례동","1평당 50000원","김현아"),
        Palm_Data("","잠실본동","1평당 50000원","양보규"),
        Palm_Data("","방이1동","1평당 50000원","고명"),
        Palm_Data("","방이2동","1평당 50000원","최영환"),
        Palm_Data("","오금동","1평당 50000원","김현아")
    )
}