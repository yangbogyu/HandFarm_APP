package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.LoginBinding


class login : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록




        // 로그인
        binding.loginBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // 회원가입
        binding.join.setOnClickListener {
            val intent = Intent(this, Join_main::class.java)
            startActivity(intent)
        }
    }




}