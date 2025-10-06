package com.example.day5.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.day5.R

class Fragment1 : Fragment(R.layout.frag1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img7: ImageView = view.findViewById(R.id.imageView7)
        img7.setImageResource(R.drawable.img1)

    }
}