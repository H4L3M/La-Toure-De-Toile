package com.latouredetoile.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayoutMediator
import com.latouredetoile.R
import com.latouredetoile.databinding.ActivityMainBinding
import com.latouredetoile.ui.main.SectionsPagerAdapter
import com.latouredetoile.utils.LAT
import com.latouredetoile.utils.LNG
import com.latouredetoile.utils.listPhotos
import com.latouredetoile.utils.numbers

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mFab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(binding.root)
            setSupportActionBar(binding.toolbar)
            mFab = fab
        }

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager, lifecycle)
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter

        TabLayoutMediator(binding.tabs, viewPager) { tab, position ->
            tab.text = resources.getStringArray(R.array.titles)[position]
        }.attach()

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> callHotel()
                    1 -> callHotel()
                    2 -> goToMap()
                    3 -> callHotel()
                    else -> {

                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })

        Glide.with(this)
            .load(listPhotos[numbers.random()])
            .centerCrop().into(binding.cover)

    }

    private fun goToMap() {
        mFab.setImageResource(R.drawable.ic_map_marker)
        mFab.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=$LAT,$LNG")
            )
            startActivity(intent)
        }
    }

    private fun callHotel() {
        mFab.setImageResource(R.drawable.ic_phone_call)
        mFab.setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:0661-511752")))
        }
    }
}