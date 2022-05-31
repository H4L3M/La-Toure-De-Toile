package com.latouredetoile.ui.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.latouredetoile.adapter.PhotosAdapter
import com.latouredetoile.databinding.FragmentPhotosBinding
import com.latouredetoile.utils.listPhotos


class PhotosFragment : Fragment() {

    private var _binding: FragmentPhotosBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var photosAdapter: PhotosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPhotosBinding.inflate(inflater, container, false).apply {
            recyclerView = recyclerPhotos
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)

        for (i in listPhotos.indices) {
            photosAdapter = PhotosAdapter(listPhotos)
        }
        recyclerView.adapter = photosAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}