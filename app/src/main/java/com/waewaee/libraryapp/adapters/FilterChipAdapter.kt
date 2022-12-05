package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.FilterChipViewHolder

class FilterChipAdapter(): RecyclerView.Adapter<FilterChipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterChipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_filter_chip, parent, false)
        return FilterChipViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilterChipViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}