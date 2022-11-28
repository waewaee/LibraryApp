package com.waewaee.libraryapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.waewaee.libraryapp.R
import com.waewaee.libraryapp.fragments.HomeFragment
import com.waewaee.libraryapp.fragments.LibraryFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchFragment(HomeFragment())

        bottomNavigation.setOnItemSelectedListener { menuItem: MenuItem ->
            when(menuItem.itemId){
                R.id.actionHome -> {
                    switchFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.actionLibrary -> {
                    switchFragment(LibraryFragment())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fgContainer, fragment)
            .commit()
    }
}