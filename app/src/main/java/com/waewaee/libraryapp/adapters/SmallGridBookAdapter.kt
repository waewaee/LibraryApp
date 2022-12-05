package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.SmallGridBookViewHolder

class SmallGridBookAdapter(): RecyclerView.Adapter<SmallGridBookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmallGridBookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_small_grid, parent, false)
        return SmallGridBookViewHolder(view)
    }

    override fun onBindViewHolder(holder: SmallGridBookViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 15
    }
}