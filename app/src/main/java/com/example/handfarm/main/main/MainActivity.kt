package com.example.handfarm.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.handfarm.R
import com.example.handfarm.databinding.ActivityMainBinding
import com.example.handfarm.databinding.LoginBinding
import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Market_Data
import com.example.handfarm.main.data.UserInfo
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // 마켓 이동
        binding.marketBut.setOnClickListener {
            val intent = Intent(this, Market_Main::class.java)
            HandFarmSingle.api.getUserInfo().enqueue(object : retrofit2.Callback<Market_Data>{
                override fun onResponse(call: Call<Market_Data>, response: Response<Market_Data>) {
                    val marketInfo = response.body()
                    if (marketInfo != null) {
                        HandFarmSingle.marketlist.clear()
                        HandFarmSingle.marketlist.addAll(marketInfo.market)
                    }
                    startActivity(intent)
                }

                override fun onFailure(call: Call<Market_Data>, t: Throwable) {
                    Log.d("error",t.message.toString())
                }
            })


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

        // 회원정보 이동
        binding.topView.userBut.setOnClickListener {
            val intent = Intent(this, information_main::class.java)
            startActivity(intent)
        }

        // 기업회원 이동
        binding.companyBut.setOnClickListener {
            val intent = Intent(this, corporation_main::class.java)
            startActivity(intent)
        }
    }

    // 토스트 명령어
    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }


}
