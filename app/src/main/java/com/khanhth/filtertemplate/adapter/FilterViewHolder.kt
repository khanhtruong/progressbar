package com.khanhth.filtertemplate.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.khanhth.filtertemplate.R

class FilterViewHolder(private var item: View): RecyclerView.ViewHolder(item) {
    private var isOn = false
    fun onBind(name: String) {
        item.findViewById<TextView>(R.id.tv_name)?.let{tvName ->
            tvName.text = name
            tvName.setOnClickListener {
                tvName.backgroundTintList = ColorStateList.valueOf(Color.parseColor(getColorString()))
            }
        }
    }

    private fun getColorString(): String {
        return if (isOn) {
            isOn = false
            "#A3A3A3"
        } else {
            isOn = true
            "#ff00ddff"
        }
    }
}