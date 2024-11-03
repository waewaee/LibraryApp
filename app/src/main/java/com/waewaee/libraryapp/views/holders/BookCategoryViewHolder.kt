package com.waewaee.libraryapp.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.adapters.BookAdapter
import com.waewaee.libraryapp.delegates.BookCatagoryDelegate
import com.waewaee.libraryapp.delegates.BookDetailDelegate
import kotlinx.android.synthetic.main.view_item_book_category.view.*

class BookCategoryViewHolder(
    itemView: View,
    mBookDetailDelegate: BookDetailDelegate,
    mBookCategoryDelegate: BookCatagoryDelegate
    ) : RecyclerView.ViewHolder(itemView) {

    init {
        val mBookAdapter = BookAdapter(mBookDetailDelegate)
        itemView.rvBooks.adapter = mBookAdapter
        itemView.rvBooks.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

        itemView.btnToCategoryDetails.setOnClickListener {
            mBookCategoryDelegate.onTapBookCategory()
        }
    }
}