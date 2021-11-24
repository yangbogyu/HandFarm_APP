package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.handfarm.R
import com.example.handfarm.data.Sharing_Data

class Sharing_Adpater (val context: Context, val Sharing_List: ArrayList<Sharing_Data>) : BaseAdapter(){

    override fun getCount(): Int {
        return Sharing_List.size
    }

    override fun getItem(position: Int): Any {
        return Sharing_List[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.market_list, null)

        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_bool = view.findViewById<TextView>(R.id.item_price)
        val user_name = view.findViewById<TextView>(R.id.user_name)


        val sharing = Sharing_List[position]
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(sharing.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)
        item_title.text = sharing.item_title

        if(sharing.item_bool)
            item_bool.text = "판매 완료"
        else
            item_bool.text = "판매중"

        user_name.text = sharing.user_name

        return view
    }

}