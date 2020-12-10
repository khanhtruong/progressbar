package com.khanhth.filtertemplate.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khanhth.filtertemplate.R

class FilterAdapter(private val initItems: ArrayList<String>): RecyclerView.Adapter<FilterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filter_search, null)
        return FilterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return initItems.size
    }

    override fun onBindViewHolder(holder: FilterViewHolder, position: Int) {
        initItems.getOrNull(position)?.let{ name->
            holder.onBind(name)
        }
    }

}