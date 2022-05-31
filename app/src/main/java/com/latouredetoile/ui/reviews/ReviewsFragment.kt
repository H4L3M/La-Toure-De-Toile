package com.latouredetoile.ui.reviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.latouredetoile.adapter.ReviewsAdapter
import com.latouredetoile.databinding.FragmentReviewsBinding
import com.latouredetoile.utils.listReviews

class ReviewsFragment : Fragment() {

    private var _binding: FragmentReviewsBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var reviewsAdapter: ReviewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentReviewsBinding.inflate(inflater, container, false).apply {
            recyclerView = recyclerReviews
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


        for (i in listReviews) {
            reviewsAdapter = ReviewsAdapter(listReviews)
        }

        recyclerView.adapter = reviewsAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}