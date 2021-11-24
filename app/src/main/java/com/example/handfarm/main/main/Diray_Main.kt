package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.DiaryMainBinding
//import com.prolificinteractive.materialcalendarview.CalendarDay
//import com.prolificinteractive.materialcalendarview.CalendarMode

class Diray_Main : AppCompatActivity() {

    private lateinit var binding: DiaryMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DiaryMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

//        binding.materialCalendar.setTopbarVisible(false)



        binding.toolbar.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}