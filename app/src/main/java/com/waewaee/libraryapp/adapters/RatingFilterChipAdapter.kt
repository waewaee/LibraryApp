package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.RatingFilterChipViewHolder

class RatingFilterChipAdapter(): RecyclerView.Adapter<RatingFilterChipViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatingFilterChipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_rating_filter_chip, parent, false)
        return RatingFilterChipViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: RatingFilterChipViewHolder, position: Int) {

    }

}