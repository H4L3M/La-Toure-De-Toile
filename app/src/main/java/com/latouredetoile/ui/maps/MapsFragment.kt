package com.latouredetoile.ui.maps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.latouredetoile.R
import com.latouredetoile.utils.LAT
import com.latouredetoile.utils.LNG
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->

        val tour = LatLng(LAT, LNG)
        val zoom = CameraUpdateFactory.newLatLngZoom(tour, 15f)

        googleMap.addMarker(MarkerOptions().position(tour).title(getString(R.string.app_name)))
        googleMap.mapType = GoogleMap.MAP_TYPE_SATELLITE

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            googleMap.animateCamera(zoom, 5000, null)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_maps, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}