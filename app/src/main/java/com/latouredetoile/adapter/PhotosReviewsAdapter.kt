package com.latouredetoile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.latouredetoile.databinding.SinglePhotoReviewBinding
import com.latouredetoile.model.Photos

class PhotosReviewsAdapter(private var listItems: MutableList<String>) :
    RecyclerView.Adapter<PhotosReviewsAdapter.PhotosReviewViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotosReviewViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val root = SinglePhotoReviewBinding.inflate(inflater, parent, false)
        return PhotosReviewViewHolder(root)
    }

    override fun onBindViewHolder(holder: PhotosReviewViewHolder, position: Int) {
        val item = listItems[position]
        val photo = holder.binding.photo
        Glide.with(photo).load(item).into(photo)
    }

    override fun getItemCount(): Int = listItems.size

    class PhotosReviewViewHolder(val binding: SinglePhotoReviewBinding) :
        RecyclerView.ViewHolder(binding.root)

}