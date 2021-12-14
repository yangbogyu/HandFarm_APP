package com.example.handfarm.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.handfarm.databinding.LoginBinding
import com.example.handfarm.main.data.Login_Data
import com.example.handfarm.main.data.Login_PUT
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class login : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root) // contentView에 등록

        // 로그인
        binding.loginBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // 아이디 비빌번호
            val data = Login_PUT(binding.name.text.toString(), binding.passwd.text.toString())
            HandFarmSingle.api.LoginPUT(data).enqueue(object : Callback<Login_Data>{
                override fun onResponse(call: Call<Login_Data>, response: Response<Login_Data>) {//성공시
                    if(!response.body().toString().isEmpty()) {
                        val join = response.body()
                        if (join != null) {
                            if (join.login) {
                                startActivity(intent)
                            } else
                                getText("회원정보 오류")
                        }
                    }
                }

                override fun onFailure(call: Call<Login_Data>, t: Throwable) {
                    getText("실패"+t.message.toString())
                }
            })


        }

        // 회원가입
        binding.join.setOnClickListener {
            val intent = Intent(this, Join_main::class.java)
            startActivity(intent)
        }
    }

    private fun getText(text:String){
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

}