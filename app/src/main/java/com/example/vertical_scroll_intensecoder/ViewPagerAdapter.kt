package com.example.vertical_scroll_intensecoder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(
    private val imagesList: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {

        holder.itemView.ivSliderImage.setImageResource(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }


    class ViewPagerHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}