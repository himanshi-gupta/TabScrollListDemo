package com.example.day5.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.R

class HorizontalAdapter(
    private val items: List<Int>
) : RecyclerView.Adapter<HorizontalAdapter.HViewHolder>() {

    class HViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.images)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_horizontal, parent, false)
        return HViewHolder(view)
    }

    override fun onBindViewHolder(holder: HViewHolder, position: Int) {
        holder.img.setImageResource(items[position])
    }

    override fun getItemCount() = items.size
}