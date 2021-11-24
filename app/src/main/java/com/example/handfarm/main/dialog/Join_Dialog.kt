package com.example.handfarm.dialog

import android.app.Dialog
import android.content.Context
import android.view.WindowManager
import android.widget.Button
import com.example.handfarm.R
import com.example.handfarm.databinding.JoinDialogBinding

class Join_Dialog(context: Context){

    private val dialog = Dialog(context)
    private lateinit var onClickListener: OnDialogClickListener

    fun setOnClickListener(listener: OnDialogClickListener)
    {
        onClickListener = listener
    }


    fun showDialog()
    {
        dialog.setContentView(R.layout.join_dialog)
        dialog.window!!.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.show()

        val notBut = dialog.findViewById<Button>(R.id.not_but)
        val okBut = dialog.findViewById<Button>(R.id.ok_but)

        //취소 버튼
        notBut.setOnClickListener {
            //다이어 로그 숨기기
            dialog.dismiss()
        }
        //확인 버튼
        okBut.setOnClickListener {
            //다이어 로그 숨기기
            dialog.dismiss()
        }

    }

    interface OnDialogClickListener
    {
        fun onClicked(name: String)
    }
}