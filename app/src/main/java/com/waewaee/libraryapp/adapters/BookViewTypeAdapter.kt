package com.waewaee.libraryapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.views.holders.BaseViewHolder
import kotlinx.android.synthetic.main.view_item_book.view.btnMoreActions

class BookViewTypeAdapter(private var mViewType: Int, private var onClickMenu:() -> Unit): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when(mViewType) {
            1 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_list_view, parent, false)
                return ViewHolder(view) { onClickMenu() }
            }
            2 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_large_grid, parent, false)
                return ViewHolder(view) { onClickMenu() }
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_book_small_grid, parent, false)
                return ViewHolder(view) { onClickMenu() }
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
//        holder.itemView.setOnClickListener {
//            onClickMenu()
//        }
    }

    override fun getItemCount(): Int {
        return 10
    }

    class ViewHolder(itemView: View, private val onTapMenu:() -> Unit): BaseViewHolder(itemView) {

        init {
            itemView.btnMoreActions.setOnClickListener {
                onTapMenu()
            }
        }
    }
}