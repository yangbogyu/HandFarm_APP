package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.handfarm.R
import com.example.handfarm.main.data.Market_Data

class Market_Adpater (val context: Context,val Market_List: ArrayList<Market_Data.marketList>?) : BaseAdapter(){

    override fun getCount(): Int {
        if (Market_List != null)
            return Market_List.size
        else
            return 0
    }

    override fun getItem(position: Int): Any {
        if (Market_List != null)
            return Market_List[position]
        else
            return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.market_list, null)

        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_price = view.findViewById<TextView>(R.id.item_price)
        val user_name = view.findViewById<TextView>(R.id.user_name)
        if (Market_List != null) {
            val market_data = Market_List[position]

            item_title.text = market_data.product_name
            item_price.text = market_data.product_price+'원'
            user_name.text = market_data.me_name
        }
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(market.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)

        return view
    }

}