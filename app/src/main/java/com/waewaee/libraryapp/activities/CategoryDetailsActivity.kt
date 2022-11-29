package com.waewaee.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.adapters.BookAdapter
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import kotlinx.android.synthetic.main.activity_category_details.*

class CategoryDetailsActivity : AppCompatActivity(), BookMoreActionsDelegate {

    private lateinit var mBooksOfCategoryAdapter: BookAdapter

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, CategoryDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_details)

        setUpRecyclerView()
        setUpListeners()
    }

    private fun setUpListeners() {
        btnBack.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setUpRecyclerView() {
        mBooksOfCategoryAdapter = BookAdapter(this)
        rvBooksOfCategory.adapter = mBooksOfCategoryAdapter
        rvBooksOfCategory.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onTapBookMoreActions() {
        val mSheet: BottomSheetBehavior<View> = BottomSheetBehavior.from(bookOfCategoryBottomSheet)
        when {
            mSheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                mSheet.state = BottomSheetBehavior.STATE_EXPANDED
            }
            else -> {
                mSheet.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }
}