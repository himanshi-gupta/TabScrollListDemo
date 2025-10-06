package com.example.day5.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.adapters.ListAdapter
import com.example.day5.R

class Fragment2 : Fragment(R.layout.frag2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView1)

        val itemList = mutableListOf("Apple", "Banana", "Mango", "Grapes", "Orange", "Watermelon", "Pineapple", "Strawberry", "Kiwi", "Apple", "Banana", "Mango", "Grapes", "Orange", "Watermelon", "Pineapple", "Strawberry", "Kiwi")
        val imgList = mutableListOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3)

        recyclerView.layoutManager = LinearLayoutManager(this.context)
        recyclerView.adapter = ListAdapter(itemList, imgList)

    }
}