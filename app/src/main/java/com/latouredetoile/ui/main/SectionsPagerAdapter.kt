package com.latouredetoile.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.latouredetoile.R
import com.latouredetoile.ui.about.AboutFragment
import com.latouredetoile.ui.maps.MapsFragment
import com.latouredetoile.ui.photos.PhotosFragment
import com.latouredetoile.ui.reviews.ReviewsFragment

class SectionsPagerAdapter(
    private val context: Context,
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int = context.resources.getStringArray(R.array.titles).size


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PhotosFragment() //2
            1 -> ReviewsFragment() //3
            2 -> MapsFragment() //4
            3 -> AboutFragment() //5
            else -> PlaceholderFragment.newInstance(position + 1)
        }
    }
}