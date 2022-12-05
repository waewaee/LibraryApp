package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.ListViewBookViewHolder

class ListViewBookAdapter(): RecyclerView.Adapter<ListViewBookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewBookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_list_view, parent, false)
        return ListViewBookViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewBookViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }
}