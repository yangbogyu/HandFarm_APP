package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.JoinMainBinding
import com.example.handfarm.dialog.Join_Dialog

class Join_main : AppCompatActivity(){
    private lateinit var binding: JoinMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JoinMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // 회원가입 버튼
        binding.joinOk.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        // 기업회원 버튼
        binding.corporation.setOnClickListener {
            val joindialog = Join_Dialog(this)
            joindialog.showDialog()
        }

        //뒤로가기 버튼
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }


    }

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}