package com.waewaee.libraryapp.views.pods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.libraryapp.adapters.FilterChipAdapter
import com.waewaee.libraryapp.adapters.ViewTypeAdapter
import com.waewaee.libraryapp.adapters.ListViewBookAdapter
import com.waewaee.libraryapp.adapters.SmallGridBookAdapter
import com.waewaee.libraryapp.delegates.BottomSheetDelegate
import kotlinx.android.synthetic.main.view_pod_books.view.*

class BooksViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    lateinit var mFilterAdapter: FilterChipAdapter
    lateinit var mViewTypeAdapter: ViewTypeAdapter
//    lateinit var mSmallGridBookAdapter: SmallGridBookAdapter
//    lateinit var mListViewBookAdapter: ListViewBookAdapter
    lateinit var bsTypeDelegate: BottomSheetDelegate

    override fun onFinishInflate() {
        setUpFilterRecyclerView()
        setUpListeners()
//        setUpLargeGridRecyclerView()
//        setUpSmallGridRecyclerView()
//        setUpListViewRecyclerView()
        setViewType(2)
        super.onFinishInflate()
    }

    fun setDelegate(delegate : BottomSheetDelegate) {
        bsTypeDelegate = delegate
    }

    fun setViewType(viewType: Int) {
        when(viewType) {
            1 -> {
//                rvListViewBooks.visibility = View.VISIBLE
//                rvLargeGridBooks.visibility = View.GONE
//                rvSmallGridBooks.visibility = View.GONE

                mViewTypeAdapter = ViewTypeAdapter(1)
                rvLargeGridBooks.adapter = mViewTypeAdapter
                rvLargeGridBooks.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            }
            2 -> {
//                rvListViewBooks.visibility = View.GONE
//                rvLargeGridBooks.visibility = View.VISIBLE
//                rvSmallGridBooks.visibility = View.GONE

                mViewTypeAdapter = ViewTypeAdapter(2)
                rvLargeGridBooks.adapter = mViewTypeAdapter
                rvLargeGridBooks.layoutManager = GridLayoutManager(context, 2)
            }
            else -> {
//                rvListViewBooks.visibility = View.GONE
//                rvLargeGridBooks.visibility = View.GONE
//                rvSmallGridBooks.visibility = View.VISIBLE

                mViewTypeAdapter = ViewTypeAdapter(3)
                rvLargeGridBooks.adapter = mViewTypeAdapter
                rvLargeGridBooks.layoutManager = GridLayoutManager(context, 3)
            }
        }
    }

    private fun setUpListeners() {
        tvSortType.setOnClickListener {
            bsTypeDelegate.onTapSortByAndViewType(1)
        }
        btnChangeView.setOnClickListener {
            bsTypeDelegate.onTapSortByAndViewType(2)
        }
    }

//    private fun setUpListViewRecyclerView() {
//        mListViewBookAdapter= ListViewBookAdapter()
//        rvListViewBooks.adapter =mListViewBookAdapter
//        rvListViewBooks.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//    }
//
//    private fun setUpSmallGridRecyclerView() {
//        mSmallGridBookAdapter = SmallGridBookAdapter()
//        rvSmallGridBooks.adapter = mSmallGridBookAdapter
//        rvSmallGridBooks.layoutManager = GridLayoutManager(context, 3)
//    }

//    private fun setUpLargeGridRecyclerView() {
//        mViewTypeAdapter = ViewTypeAdapter()
//        rvLargeGridBooks.adapter = mViewTypeAdapter
//        rvLargeGridBooks.layoutManager = GridLayoutManager(context, 2)
//    }

    private fun setUpFilterRecyclerView() {
        mFilterAdapter = FilterChipAdapter()
        rvFilters.adapter = mFilterAdapter
        rvFilters.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}