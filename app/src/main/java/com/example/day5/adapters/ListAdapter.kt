package com.example.day5.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.R

class ListAdapter(private val itemList: MutableList<String>, private val imgList: MutableList<Int>) :
    RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.itemText)
        val imgView: ImageView = itemView.findViewById(R.id.itemImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.d("Poshmark", "onCreateViewHolder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d("Poshmark", "onBindViewHolder")
        holder.textView.text = itemList[position]
        holder.imgView.setImageResource(imgList[position])
    }

    override fun getItemCount(): Int {
        Log.d("Poshmark", "getItemCount")
        return itemList.size
    }

    // ✅ Function to add new item dynamically
    fun addItem(item: String) {
        Log.d("Poshmark", "addItem")
        itemList.add(item)
        notifyItemInserted(itemList.size - 1)
    }
}