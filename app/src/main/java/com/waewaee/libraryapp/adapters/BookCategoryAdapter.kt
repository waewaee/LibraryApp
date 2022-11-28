package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import com.waewaee.libraryapp.views.holders.BookCategoryViewHolder

class BookCategoryAdapter(private var mDelegate: BookMoreActionsDelegate): RecyclerView.Adapter<BookCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookCategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_category, parent, false)
        return BookCategoryViewHolder(view, mDelegate)
    }

    override fun onBindViewHolder(holder: BookCategoryViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}