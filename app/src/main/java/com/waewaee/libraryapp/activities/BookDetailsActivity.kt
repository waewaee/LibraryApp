package com.waewaee.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.adapters.ReviewAdapter
import kotlinx.android.synthetic.main.activity_book_details.rvReviews

class BookDetailsActivity : AppCompatActivity() {

    private lateinit var mReviewAdapter: ReviewAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BookDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        mReviewAdapter = ReviewAdapter()
        rvReviews.adapter = mReviewAdapter
        rvReviews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}