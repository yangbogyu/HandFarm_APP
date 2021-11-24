package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.InformationBinding

class information_main: AppCompatActivity(){
    private lateinit var binding: InformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InformationBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록



        // 회원정보 수정
        binding.informationRevise.setOnClickListener {
            getText("회원정보 수정 미구현")
        }

        //뒤로가기 버튼
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}