package com.waewaee.libraryapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import com.waewaee.libraryapp.delegates.BottomSheetDelegate
import kotlinx.android.synthetic.main.change_view_bottom_sheet.rgViewType
import kotlinx.android.synthetic.main.fragment_home.bookBottomSheet
import kotlinx.android.synthetic.main.fragment_library.*
import kotlinx.android.synthetic.main.view_pod_books.vpBooks

class LibraryFragment : Fragment(), BottomSheetDelegate, BookMoreActionsDelegate {

    var mContext: Context? = null
    lateinit var mSortBySheet: BottomSheetBehavior<View>
    lateinit var  mViewTypeSheet: BottomSheetBehavior<View>
    lateinit var mBookBottomSheet: BottomSheetBehavior<View>

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mSortBySheet = BottomSheetBehavior.from(sortByBottomSheet)
        mViewTypeSheet = BottomSheetBehavior.from(viewTypeBottomSheet)
        mBookBottomSheet = BottomSheetBehavior.from(bookBottomSheet)

        setUpTabLayout()
        vpBooks.setBottomSheetDelegate(this, this)
        setUpListeners()
    }

    private fun setUpListeners() {
        rgViewType.setOnCheckedChangeListener { group, checkedId ->
            mViewTypeSheet.state = BottomSheetBehavior.STATE_COLLAPSED

            when(checkedId) {
                R.id.rbList -> {
                    vpBooks.setViewType(1)
                }
                R.id.rbLargeGrid -> {
                    vpBooks.setViewType(2)
                }
                R.id.rbSmallGrid -> {
                    vpBooks.setViewType(3)
                }
            }
        }
    }

    private fun setUpTabLayout() {
        tabLayoutLibrary.addTab(tabLayoutLibrary.newTab().setText("Your Books"))
        tabLayoutLibrary.addTab(tabLayoutLibrary.newTab().setText("Your Shelves"))

    }

    override fun onTapSortByAndViewType(bsType: Int) {
        when(bsType) {
            1 -> {
                when {
                    mSortBySheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                        mSortBySheet.state = BottomSheetBehavior.STATE_EXPANDED
                    }
                    else -> {
                        mSortBySheet.state = BottomSheetBehavior.STATE_COLLAPSED
                    }
                }
            }
            else -> {
                when {
                    mViewTypeSheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                        mViewTypeSheet.state = BottomSheetBehavior.STATE_EXPANDED
                    }
                    else -> {
                        mViewTypeSheet.state = BottomSheetBehavior.STATE_COLLAPSED
                    }
                }
            }
        }
    }

    override fun onTapBookMoreActions() {
        when {
            mBookBottomSheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                mBookBottomSheet.state = BottomSheetBehavior.STATE_EXPANDED
            }
            else -> {
                mBookBottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }

}