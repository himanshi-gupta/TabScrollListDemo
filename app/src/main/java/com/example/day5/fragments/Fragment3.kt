package com.example.day5.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.adapters.GridAdapter
import com.example.day5.R

class Fragment3 : Fragment(R.layout.frag3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView : RecyclerView = view.findViewById(R.id.recyclerView2)
        val imgList = mutableListOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3)
        recyclerView.layoutManager = GridLayoutManager(this.context, 2)
        recyclerView.adapter = GridAdapter(imgList)

    }
}