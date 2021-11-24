package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.handfarm.adpater.Market_Adpater
import com.example.handfarm.data.Market_Data
import com.example.handfarm.R
import com.example.handfarm.adpater.Sharing_Adpater
import com.example.handfarm.databinding.DiaryMainBinding
import com.example.handfarm.databinding.MarketMainBinding
import com.example.handfarm.detail.Market_Detail

class Market_Main : AppCompatActivity(){

    val datas = mutableListOf<Market_Data>()

    private lateinit var binding: MarketMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MarketMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        val market_Adpa = Market_Adpater(this, list)
        binding.marketList.adapter = market_Adpa


        // 스피너 선언
        binding.categorySpn.adapter = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item)
        binding.optionSpn.adapter = ArrayAdapter.createFromResource(this, R.array.market_option, android.R.layout.simple_spinner_item)


        // 메인으로 화면이동
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // 장바구니 이동
        binding.topView.basketBut.setOnClickListener {
            val intent = Intent(this, Shoppingbag_Main::class.java)
            startActivity(intent)
        }

        binding.marketList.setOnItemClickListener { parent : AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position) as Market_Data

            // 마켓 새부정보 화면이동
            val intent = Intent(this, Market_Detail::class.java)
            startActivity(intent)

        }
    }


    val list = arrayListOf<Market_Data>(
        Market_Data("","흙당근","1kg당 2000원","김현아"),
        Market_Data("","당근","1kg당 2000원","양보규"),
        Market_Data("","작은당근","1kg당 2000원","고명"),
        Market_Data("","큰당근","1kg당 2000원","최영환"),
        Market_Data("","직접키운당근","1kg당 2000원","김현아")
    )
}