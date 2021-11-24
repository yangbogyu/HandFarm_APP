package com.example.handfarm.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.handfarm.R
import com.example.handfarm.databinding.ActivityMainBinding
import com.example.handfarm.databinding.LoginBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // 마켓 이동
        binding.marketBut.setOnClickListener {
            val intent = Intent(this, Market_Main::class.java)
            startActivity(intent)
        }

        // 다이어리 이동
        binding.diaryBut.setOnClickListener {
            val intent = Intent(this, Diray_Main::class.java)
            startActivity(intent)
        }

        // 나눔장터 이동
        binding.sharingBut.setOnClickListener {
            val intent = Intent(this, Sharing_Main::class.java)
            startActivity(intent)
        }

        // 텃밭관리 이동
        binding.palmBut.setOnClickListener {
            val intent = Intent(this, Palm_Main::class.java)
            startActivity(intent)
        }

        binding.topView.userBut.setOnClickListener {
            val intent = Intent(this, information_main::class.java)
            startActivity(intent)
        }
        binding.companyBut.setOnClickListener {
            getText("기업회원 미구현")

        }
    }

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

}
