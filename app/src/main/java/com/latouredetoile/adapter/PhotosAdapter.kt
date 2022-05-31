package com.latouredetoile.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.latouredetoile.databinding.SinglePhotoBinding
import com.latouredetoile.model.Photos
import com.latouredetoile.ui.photos.ReviewPhotosActivity

class PhotosAdapter(private var listItems: MutableList<String>) :
    RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val root = SinglePhotoBinding.inflate(inflater, parent, false)
        return PhotosViewHolder(root)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        val img = listItems[position]
        val ctx = holder.itemView.context
        val photo = holder.binding.photo
        Glide.with(ctx).load(img).centerCrop().into(photo)
        photo.setOnClickListener {
            ctx.startActivity(
                Intent(ctx, ReviewPhotosActivity::class.java)
                    .putExtra("position", position)
            )
        }
    }

    override fun getItemCount(): Int = listItems.size

    class PhotosViewHolder(val binding: SinglePhotoBinding) : RecyclerView.ViewHolder(binding.root)
}