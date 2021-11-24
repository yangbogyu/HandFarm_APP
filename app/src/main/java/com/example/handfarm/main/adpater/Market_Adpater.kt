package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.handfarm.data.Market_Data
import com.example.handfarm.R

class Market_Adpater (val context: Context,val Market_List: ArrayList<Market_Data>) : BaseAdapter(){

    override fun getCount(): Int {
        return Market_List.size
    }

    override fun getItem(position: Int): Any {
        return Market_List[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.market_list, null)

        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_price = view.findViewById<TextView>(R.id.item_price)
        val user_name = view.findViewById<TextView>(R.id.user_name)


        val market = Market_List[position]
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(market.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)
        item_title.text = market.item_title
        item_price.text = market.item_price
        user_name.text = market.user_name

        return view
    }

}