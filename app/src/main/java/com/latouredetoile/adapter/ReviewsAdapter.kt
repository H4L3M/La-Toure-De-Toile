package com.latouredetoile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.latouredetoile.databinding.SingleReviewBinding
import com.latouredetoile.model.Review

class ReviewsAdapter(private var listReviews: MutableList<Review>) :
    RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val root = SingleReviewBinding.inflate(inflater, parent, false)
        return ReviewsViewHolder(root)
    }

    override fun onBindViewHolder(holder: ReviewsViewHolder, position: Int) {
        val review = listReviews[position]
        val ctx = holder.itemView.context

        holder.binding.userName.text = review.name
        holder.binding.comment.text = review.comment
        holder.binding.rating.rating = review.rating
        Glide.with(ctx).load(review.userImg).centerCrop().into(holder.binding.userImg)
    }

    override fun getItemCount(): Int = listReviews.size

    class ReviewsViewHolder(val binding: SingleReviewBinding) :
        RecyclerView.ViewHolder(binding.root)
}