package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.data.ShppingBag_Data
import com.example.handfarm.adpater.Shoppingbag_Adpater
import com.example.handfarm.databinding.ShoppingbagMainBinding

class Shoppingbag_Main : AppCompatActivity(){

    val datas = mutableListOf<ShppingBag_Data>()

    private lateinit var binding: ShoppingbagMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ShoppingbagMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        val shoppingbag_Adpa = Shoppingbag_Adpater(this, list)
        binding.shoppingbagList.adapter = shoppingbag_Adpa

        // 장터 화면이동
        binding.topView.backBut.setOnClickListener {
            val intent = Intent(this, Market_Main::class.java)
            startActivity(intent)
        }

        binding.buy.setOnClickListener {
            getText("구매 상세 미구현")
        }

        // 아이템 리스트
        binding.shoppingbagList.setOnItemClickListener { parent : AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position) as ShppingBag_Data

        }
    }


    val list = arrayListOf<ShppingBag_Data>(
        ShppingBag_Data("","한감자","깻잎","2묶음","1500원"),
        ShppingBag_Data("","김감자","상추","1kg","5000원"),
        ShppingBag_Data("","김현아","깻잎","1kg","2000원")
        )

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}