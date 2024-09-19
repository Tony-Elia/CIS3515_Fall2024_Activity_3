package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val list: Array<Int>) : BaseAdapter() {
    
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return list[position].toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if(convertView == null) {
            textView = TextView(context)
            textView.text = list[position].toString()
            textView.setPadding(10, 10, 10, 10)
        } else {
            textView = convertView as TextView
        }
        textView.textSize = 20f
        textView.text = list[position].toString()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = getView(position, convertView, parent);
        (view as TextView).textSize = list[position].toFloat()
        return view
    }

}