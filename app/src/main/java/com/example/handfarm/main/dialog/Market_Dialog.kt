package com.example.handfarm.dialog

import android.content.Context
import android.view.View
import android.widget.ArrayAdapter
import com.example.handfarm.R
import com.example.handfarm.databinding.MarketDialogBinding
import com.example.handfarm.databinding.SharingMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class Market_Dialog(context: Context) : BottomSheetDialog(context) {

    private var binding: MarketDialogBinding

    init {
        binding = MarketDialogBinding.inflate(layoutInflater)

        //R.layout.confirm_bottom_dialog 하단 다이어로그 생성 버튼을 눌렀을 때 보여질 레이아웃
        //val view: View = layoutInflater.inflate(R.layout.market_dialog, null
        setContentView(binding.root)

        binding.nameSpn.adapter = ArrayAdapter.createFromResource(context, R.array.product, android.R.layout.simple_spinner_item)

        //확인 버튼
        binding.okBut.setOnClickListener {
            //다이어 로그 숨기기
            dismiss()

        }

    }
}