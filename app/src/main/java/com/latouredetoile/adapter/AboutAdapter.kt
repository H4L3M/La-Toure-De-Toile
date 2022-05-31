package com.latouredetoile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.latouredetoile.databinding.SingleDutyTimesBinding

class AboutAdapter(private var listItems: Array<String>) :
    RecyclerView.Adapter<AboutAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val root = SingleDutyTimesBinding.inflate(inflater, parent, false)
        return VH(root)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = listItems[position]
        holder.binding.dutyTime.text = item
    }

    override fun getItemCount(): Int = listItems.size

    class VH(val binding: SingleDutyTimesBinding) : RecyclerView.ViewHolder(binding.root)
}