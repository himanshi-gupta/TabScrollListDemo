package com.example.day5.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.day5.models.Item
import com.example.day5.adapters.MainAdapter
import com.example.day5.R

class Fragment4 : Fragment(R.layout.frag4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.combinedRecyclerView)

        // Sample data
        val data = listOf(
            Item(false, "January"),
            Item(false, "February"),
            Item(false, "March"),
            Item(false, "April"),
            Item(false, "May"),
            Item(
                true,
                horizontalItems = listOf(
                    R.drawable.img1,
                    R.drawable.img2,
                    R.drawable.img3,
                    R.drawable.img4,
                    R.drawable.img5
                )
            ),
            Item(false, "June"),
            Item(false, "July"),
            Item(false, "August"),
            Item(false, "September"),
            Item(false, "October"),
            Item(false, "November"),
            Item(false, "December")
        )

        recyclerView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = MainAdapter(data)

    }
}