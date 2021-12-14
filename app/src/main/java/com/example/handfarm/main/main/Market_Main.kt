package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.adpater.Market_Adpater
import com.example.handfarm.R
import com.example.handfarm.databinding.MarketMainBinding
import com.example.handfarm.detail.Market_Detail
import com.example.handfarm.main.data.Market_Data
import retrofit2.Call
import retrofit2.Response

class Market_Main : AppCompatActivity(){

    private lateinit var binding: MarketMainBinding
//    var marketlist = arrayListOf<Market_Data.marketList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MarketMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        getText(HandFarmSingle.marketlist.toString())
        val market_Adpa = Market_Adpater(this, HandFarmSingle.marketlist)
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

        // 상품 클릭시
        binding.marketList.setOnItemClickListener { parent : AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position) as Market_Data.marketList

            getText(""+position)

            // 마켓 새부정보 화면이동
            val intent = Intent(this, Market_Detail::class.java)

            intent.putExtra("position", position)
            startActivity(intent)

        }
    }
    //토스트
    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}