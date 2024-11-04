package com.waewaee.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.libraryapp.R
import kotlinx.android.synthetic.main.activity_more_about_book_details.btnBack

class MoreAboutBookDetailsActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MoreAboutBookDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_about_book_details)

        btnBack.setOnClickListener {
            super.onBackPressed()
        }
    }
}