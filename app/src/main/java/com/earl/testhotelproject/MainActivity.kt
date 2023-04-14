package com.earl.testhotelproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsFragment
import com.earl.testhotelproject.R
import com.earl.testhotelproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        showFragment()
    }

    private fun showFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, SearchHotelsFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }
}