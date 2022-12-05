package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.LargeGridBookViewHolder

class LargeGridBookAdapter(): RecyclerView.Adapter<LargeGridBookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LargeGridBookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_large_grid, parent, false)
        return LargeGridBookViewHolder(view)
    }

    override fun onBindViewHolder(holder: LargeGridBookViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}