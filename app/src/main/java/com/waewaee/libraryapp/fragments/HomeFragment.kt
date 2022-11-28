package com.waewaee.libraryapp.fragments

import alirezat775.lib.carouselview.Carousel
import alirezat775.lib.carouselview.CarouselView
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.adapters.BookCategoryAdapter
import com.waewaee.libraryapp.adapters.CarouselAdapter
import com.waewaee.libraryapp.data.vos.VisaCardVO
import com.waewaee.libraryapp.delegates.BookMoreActionsDelegate
import com.waewaee.libraryapp.delegates.VisaCardDelegate
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), VisaCardDelegate, BookMoreActionsDelegate {

    lateinit var carouselAdapter: CarouselAdapter
    lateinit var carousel: Carousel
    var mContext: Context? = null

    lateinit var mBookCategoryAdapter: BookCategoryAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpCarousel()
        setUpTabLayout()
        setUpCategoriesRecyclerView()
    }

    private fun setUpCategoriesRecyclerView() {
        mBookCategoryAdapter = BookCategoryAdapter(this)
        rvBookCategories.adapter = mBookCategoryAdapter
        rvBookCategories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun setUpTabLayout() {
        with(tabLayoutHome) {
            tabLayoutHome.addTab(tabLayoutHome.newTab().setText("Ebooks"))
            tabLayoutHome.addTab(tabLayoutHome.newTab().setText("Audio Books"))
        }
    }

    private fun setUpCarousel() {
        carouselAdapter = CarouselAdapter(this)
        carousel = Carousel(context as AppCompatActivity, recentBooksCarousel, carouselAdapter)
        carousel.setOrientation(CarouselView.HORIZONTAL, false)
        carousel.scaleView(true)

        carousel.add(VisaCardVO(1))
        carousel.add(VisaCardVO(2))
        carousel.add(VisaCardVO(3))
        carousel.add(VisaCardVO(4))
        carousel.add(VisaCardVO(5))
    }

    override fun onTapCard(cardId: Int) {

    }

    override fun onTapBookMoreActions() {

        val mSheet: BottomSheetBehavior<View> = BottomSheetBehavior.from(bookBottomSheet)
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