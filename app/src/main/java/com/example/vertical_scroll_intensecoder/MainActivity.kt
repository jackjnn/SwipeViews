package com.example.vertical_scroll_intensecoder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagesList = listOf(
            R.drawable.scrollpic1,
            R.drawable.scrollpic2,
            R.drawable.scrollpic3)

        val adapter = ViewPagerAdapter(imagesList)
        viewPager.adapter = adapter
    }
}

