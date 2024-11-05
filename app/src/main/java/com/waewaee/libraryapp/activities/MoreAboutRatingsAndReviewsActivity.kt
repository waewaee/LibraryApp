package com.waewaee.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.adapters.RatingFilterChipAdapter
import com.waewaee.libraryapp.adapters.ReviewAdapter
import kotlinx.android.synthetic.main.activity_book_details.rvReviews
import kotlinx.android.synthetic.main.activity_more_about_ratings_and_reviews.btnBack
import kotlinx.android.synthetic.main.activity_more_about_ratings_and_reviews.rvRatingFilters

class MoreAboutRatingsAndReviewsActivity : AppCompatActivity() {

    private lateinit var mRatingFilterChipAdapter: RatingFilterChipAdapter
    private lateinit var mReviewAdapter: ReviewAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MoreAboutRatingsAndReviewsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_about_ratings_and_reviews)

        setUpRecyclerViews()
        setUpListeners()
    }

    private fun setUpListeners() {
        btnBack.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setUpRecyclerViews() {
        mRatingFilterChipAdapter = RatingFilterChipAdapter()
        rvRatingFilters.adapter = mRatingFilterChipAdapter
        rvRatingFilters.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        mReviewAdapter = ReviewAdapter()
        rvReviews.adapter = mReviewAdapter
        rvReviews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}