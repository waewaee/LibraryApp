package com.waewaee.libraryapp.views.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.delegates.BookDetailDelegate
import kotlinx.android.synthetic.main.activity_book_details.view.cardBookImage
import kotlinx.android.synthetic.main.view_item_book.view.*

class BookViewHolder(
    itemView: View,
    mBookDelegate: BookDetailDelegate
    ): RecyclerView.ViewHolder(itemView) {

    init {
        itemView.btnMoreActions.setOnClickListener {
            mBookDelegate.onTapBookMoreActions()
        }

        itemView.cardBookImage.setOnClickListener {
            mBookDelegate.onTapBook()
        }
    }
}