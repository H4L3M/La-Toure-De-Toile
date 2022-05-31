package com.latouredetoile.ui.photos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.doOnAttach
import com.latouredetoile.adapter.PhotosReviewsAdapter
import com.latouredetoile.databinding.ActivityReviewPhotosBinding
import com.latouredetoile.utils.ZoomOutPageTransformer
import com.latouredetoile.utils.listPhotos

class ReviewPhotosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReviewPhotosBinding

    private lateinit var photosAdapter: PhotosReviewsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewPhotosBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        val position = intent.getIntExtra("position", -1)

        for (i in listPhotos.indices) {
            photosAdapter = PhotosReviewsAdapter(listPhotos)
        }

        binding.viewPager.apply {
            doOnAttach { setCurrentItem(position, false) }
            adapter = photosAdapter
            setPageTransformer(ZoomOutPageTransformer())
        }
    }
}