package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.handfarm.data.Corporation_Farm_Data
import com.example.handfarm.R

class Corporation_Farm_Adpater (val context: Context, val Farm_list: ArrayList<Corporation_Farm_Data>) : BaseAdapter(){

    override fun getCount(): Int {
        return Farm_list.size
    }

    override fun getItem(position: Int): Any {
        return Farm_list[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.corporation_list, null)

        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_price = view.findViewById<TextView>(R.id.item_period)

        val farm = Farm_list[position]
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(market.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)
        item_title.text = farm.item_title
        item_price.text = farm.item_period

        return view
    }

}