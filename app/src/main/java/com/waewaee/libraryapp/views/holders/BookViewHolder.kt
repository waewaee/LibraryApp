package com.waewaee.libraryapp.views.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import kotlinx.android.synthetic.main.view_item_book.view.*

class BookViewHolder(itemView: View, private var mMoreActionsDelegate: BookMoreActionsDelegate): RecyclerView.ViewHolder(itemView) {

    init {
        itemView.btnMoreActions.setOnClickListener {
            mMoreActionsDelegate.onTapBookMoreActions()
        }
    }
}