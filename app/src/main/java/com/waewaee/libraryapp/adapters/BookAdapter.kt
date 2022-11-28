package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import com.waewaee.libraryapp.views.holders.BookViewHolder

class BookAdapter(private var mDelegate: BookMoreActionsDelegate): RecyclerView.Adapter<BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book, parent, false)
        return BookViewHolder(view, mDelegate)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7
    }
}