package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.ReviewViewHolder

class ReviewAdapter: RecyclerView.Adapter<ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_review, parent, false )
        return ReviewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {

    }

}