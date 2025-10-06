package com.example.day5.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.models.Item
import com.example.day5.R

class MainAdapter(
    private val items: List<Item>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_NORMAL = 0
        private const val TYPE_HORIZONTAL = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (items[position].isHorizontal) TYPE_HORIZONTAL else TYPE_NORMAL
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_NORMAL) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_vertical, parent, false)
            NormalViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.horizontal_view, parent, false)
            HorizontalViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is NormalViewHolder) {
            holder.bind(items[position].title)
        } else if (holder is HorizontalViewHolder) {
            holder.bind(items[position].horizontalItems)
        }
    }

    override fun getItemCount() = items.size

    class NormalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvTitle = itemView.findViewById<TextView>(R.id.months)
        fun bind(text: String) {
            tvTitle.text = text
        }
    }

    class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val horizontalRecycler = itemView.findViewById<RecyclerView>(R.id.horizontalRecycler)
        fun bind(data: List<Int>) {
            horizontalRecycler.layoutManager =
                LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            horizontalRecycler.adapter = HorizontalAdapter(data)
        }
    }
}