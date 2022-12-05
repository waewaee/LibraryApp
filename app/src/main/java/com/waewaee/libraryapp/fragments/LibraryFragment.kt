package com.waewaee.libraryapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.waewaee.libraryapp.R
import kotlinx.android.synthetic.main.fragment_library.*

class LibraryFragment : Fragment() {

    var mContext: Context? = null

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

        setUpTabLayout()
    }

    private fun setUpTabLayout() {
        tabLayoutLibrary.addTab(tabLayoutLibrary.newTab().setText("Your Books"))
        tabLayoutLibrary.addTab(tabLayoutLibrary.newTab().setText("Your Shelves"))

    }

}