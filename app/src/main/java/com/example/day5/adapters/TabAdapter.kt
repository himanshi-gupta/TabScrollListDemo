package com.example.day5.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.day5.fragments.Fragment1
import com.example.day5.fragments.Fragment2
import com.example.day5.fragments.Fragment3
import com.example.day5.fragments.Fragment4

class TabAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 4  // no. of tabs

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment4()
        }
    }
}