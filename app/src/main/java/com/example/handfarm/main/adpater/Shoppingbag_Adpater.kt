package com.example.handfarm.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.example.handfarm.R
import com.example.handfarm.data.ShppingBag_Data

class Shoppingbag_Adpater (val context: Context, val ShoppingBag_List: ArrayList<ShppingBag_Data>) : BaseAdapter(){

    override fun getCount(): Int {
        return ShoppingBag_List.size
    }

    override fun getItem(position: Int): Any {
        return ShoppingBag_List[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.shoppingbag_list, null)

        val item_check = view.findViewById<CheckBox>(R.id.item_check)
        val item_title = view.findViewById<TextView>(R.id.item_title)
        val item_quantity = view.findViewById<TextView>(R.id.item_quantity)
        val item_price = view.findViewById<TextView>(R.id.item_price)


        val shoppingbag = ShoppingBag_List[position]
//        이미지 처리 생략
//        val resourceId = context.resources.getIdentifier(market.item_img, "drawable",context.packageName)
//        item_img.setImageResource(resourceId)
        item_check.text = shoppingbag.item_check
        item_title.text = shoppingbag.item_title
        item_quantity.text = shoppingbag.item_quantity
        item_price.text = shoppingbag.item_price

        return view
    }

}