package com.waewaee.libraryapp.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.adapters.BookAdapter
import com.waewaee.libraryapp.delegates.BookCategoryDelegate
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import kotlinx.android.synthetic.main.view_item_book_category.view.*

class BookCategoryViewHolder(
    itemView: View,
    mMoreActionsDelegate: BookMoreActionsDelegate,
    private var mCategoryDelgate: BookCategoryDelegate
                             ): RecyclerView.ViewHolder(itemView) {

    init {
        val mBookAdapter = BookAdapter(mMoreActionsDelegate)
        itemView.rvBooks.adapter = mBookAdapter
        itemView.rvBooks.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

        itemView.btnToCategoryDetails.setOnClickListener {
            mCategoryDelgate.onTapBookCategory()
        }
    }
}