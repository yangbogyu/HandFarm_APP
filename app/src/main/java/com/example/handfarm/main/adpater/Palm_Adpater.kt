package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.handfarm.R
import com.example.handfarm.data.Palm_Data

class Palm_Adpater (val context: Context, val Palm_List: ArrayList<Palm_Data>) : BaseAdapter(){

    override fun getCount(): Int {
        return Palm_List.size
    }

    override fun getItem(position: Int): Any {
        return Palm_List[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.market_list, null)

        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_price = view.findViewById<TextView>(R.id.item_price)
        val user_name = view.findViewById<TextView>(R.id.user_name)


        val palm = Palm_List[position]
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(palm.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)
        item_title.text = palm.item_title
        item_price.text = palm.item_price
        user_name.text = palm.user_name

        return view
    }

}