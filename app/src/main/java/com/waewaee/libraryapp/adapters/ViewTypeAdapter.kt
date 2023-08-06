package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.BaseViewTypeViewHolder
import com.waewaee.libraryapp.views.holders.LargeGridBookViewHolder
import com.waewaee.libraryapp.views.holders.ListViewBookViewHolder
import com.waewaee.libraryapp.views.holders.SmallGridBookViewHolder

class ViewTypeAdapter(private var mViewType: Int): RecyclerView.Adapter<BaseViewTypeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewTypeViewHolder {
        when(mViewType) {
            1 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_list_view, parent, false)
                return ListViewBookViewHolder(view)
            }
            2 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_large_grid, parent, false)
                return LargeGridBookViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_small_grid, parent, false)
                return SmallGridBookViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewTypeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}