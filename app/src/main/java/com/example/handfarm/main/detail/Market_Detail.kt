package com.example.handfarm.detail

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.MarketDetailBinding
import com.example.handfarm.dialog.Market_Dialog
import com.example.handfarm.main.HandFarmSingle
import com.example.handfarm.main.Market_Main
import com.example.handfarm.main.Shoppingbag_Main

class Market_Detail : AppCompatActivity(){

    private lateinit var binding: MarketDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MarketDetailBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

//        binding.sellerName.text(HandFarmSingle.marketlist.get(1).me_name) //판매자 이름


        // 마켓 화면이동
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, Market_Main::class.java)
            startActivity(intent)
        }
        // 장바구니 이동
        binding.topView.basketBut.setOnClickListener {
            val intent = Intent(this, Shoppingbag_Main::class.java)
            startActivity(intent)
        }

        // 장바구니 담기
        binding.dialogBut.setOnClickListener {
            val marketDialog = Market_Dialog(this)
            marketDialog.show()
        }


    }

}