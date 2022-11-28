package com.waewaee.libraryapp.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.adapters.BookAdapter
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import kotlinx.android.synthetic.main.view_item_book_category.view.*

class BookCategoryViewHolder(itemView: View, private var mDelegate: BookMoreActionsDelegate): RecyclerView.ViewHolder(itemView) {

    init {
        val mBookAdapter = BookAdapter(mDelegate)
        itemView.rvBooks.adapter = mBookAdapter
        itemView.rvBooks.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
    }
}