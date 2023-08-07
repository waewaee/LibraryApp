package com.waewaee.libraryapp.views.pods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.libraryapp.adapters.FilterChipAdapter
import com.waewaee.libraryapp.adapters.BookViewTypeAdapter
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import com.waewaee.libraryapp.delegates.BottomSheetDelegate
import kotlinx.android.synthetic.main.view_pod_books.view.*

class BooksViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    lateinit var mFilterAdapter: FilterChipAdapter
    lateinit var mBookViewTypeAdapter: BookViewTypeAdapter
    lateinit var bsTypeDelegate: BottomSheetDelegate
    lateinit var bookDelegate: BookMoreActionsDelegate

    override fun onFinishInflate() {
        setUpFilterRecyclerView()
        setUpListeners()
//        setUpLargeGridRecyclerView()
//        setUpSmallGridRecyclerView()
//        setUpListViewRecyclerView()
        setViewType(2)
        super.onFinishInflate()
    }

    fun setBottomSheetDelegate(delegate : BottomSheetDelegate, delegate2: BookMoreActionsDelegate) {
        bsTypeDelegate = delegate
        bookDelegate = delegate2
    }

    fun setViewType(viewType: Int) {
        when(viewType) {
            1 -> {
//                rvListViewBooks.visibility = View.VISIBLE
//                rvLargeGridBooks.visibility = View.GONE
//                rvSmallGridBooks.visibility = View.GONE

                mBookViewTypeAdapter = BookViewTypeAdapter(1) { onTapBookMoreAction() }
                rvViewTypeBooks.adapter = mBookViewTypeAdapter
                rvViewTypeBooks.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            }
            2 -> {
//                rvListViewBooks.visibility = View.GONE
//                rvLargeGridBooks.visibility = View.VISIBLE
//                rvSmallGridBooks.visibility = View.GONE

                mBookViewTypeAdapter = BookViewTypeAdapter(2) { onTapBookMoreAction() }
                rvViewTypeBooks.adapter = mBookViewTypeAdapter
                rvViewTypeBooks.layoutManager = GridLayoutManager(context, 2)
            }
            else -> {
//                rvListViewBooks.visibility = View.GONE
//                rvLargeGridBooks.visibility = View.GONE
//                rvSmallGridBooks.visibility = View.VISIBLE

                mBookViewTypeAdapter = BookViewTypeAdapter(3) { onTapBookMoreAction() }
                rvViewTypeBooks.adapter = mBookViewTypeAdapter
                rvViewTypeBooks.layoutManager = GridLayoutManager(context, 3)
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

    private fun setUpFilterRecyclerView() {
        mFilterAdapter = FilterChipAdapter()
        rvFilters.adapter = mFilterAdapter
        rvFilters.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun onTapBookMoreAction() {
        bookDelegate.onTapBookMoreActions()
    }
}