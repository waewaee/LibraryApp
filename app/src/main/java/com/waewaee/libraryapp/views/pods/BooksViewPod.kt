package com.waewaee.libraryapp.views.pods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.libraryapp.adapters.FilterChipAdapter
import com.waewaee.libraryapp.adapters.LargeGridBookAdapter
import com.waewaee.libraryapp.adapters.ListViewBookAdapter
import com.waewaee.libraryapp.adapters.SmallGridBookAdapter
import kotlinx.android.synthetic.main.view_pod_books.view.*

class BooksViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    lateinit var mFilterAdapter: FilterChipAdapter
    lateinit var mLargeGridBookAdapter: LargeGridBookAdapter
    lateinit var mSmallGridBookAdapter: SmallGridBookAdapter
    lateinit var mListViewBookAdapter: ListViewBookAdapter

    override fun onFinishInflate() {
        setUpFilterRecyclerView()
        setUpListeners()
        setUpLargeGridRecyclerView()
        setUpSmallGridRecyclerView()
        setUpListViewRecyclerView()
        super.onFinishInflate()
    }

    private fun setUpListeners() {

    }

    private fun setUpListViewRecyclerView() {
        mListViewBookAdapter= ListViewBookAdapter()
        rvListViewBooks.adapter =mListViewBookAdapter
        rvListViewBooks.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun setUpSmallGridRecyclerView() {
        mSmallGridBookAdapter = SmallGridBookAdapter()
        rvSmallGridBooks.adapter = mSmallGridBookAdapter
        rvSmallGridBooks.layoutManager = GridLayoutManager(context, 3)
    }

    private fun setUpLargeGridRecyclerView() {
        mLargeGridBookAdapter = LargeGridBookAdapter()
        rvLargeGridBooks.adapter = mLargeGridBookAdapter
        rvLargeGridBooks.layoutManager = GridLayoutManager(context, 2)
    }

    private fun setUpFilterRecyclerView() {
        mFilterAdapter = FilterChipAdapter()
        rvFilters.adapter = mFilterAdapter
        rvFilters.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}