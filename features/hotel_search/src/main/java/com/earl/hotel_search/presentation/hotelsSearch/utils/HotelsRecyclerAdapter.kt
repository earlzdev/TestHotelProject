package com.earl.hotel_search.presentation.hotelsSearch.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.earl.hotel_search.R
import com.earl.hotel_search.databinding.RecyclerHotelItemBinding
import com.earl.hotel_search.domain.models.Hotel

class HotelsRecyclerAdapter: ListAdapter<Hotel, HotelsRecyclerAdapter.ItemViewHolder>(Diff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RecyclerHotelItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ItemViewHolder(private val binding: RecyclerHotelItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Hotel) {
            val context = binding.hotelName.context
            binding.hotelName.text = String.format(context.getString(R.string.hotel_title), item.name)
            binding.distanceFromCenter.text = String.format(context.getString(R.string.distance_from_center_text, item.distance.toString()))
            binding.ratingBar.rating = item.stars.toFloat()
            binding.freePlacesBtn.isVisible = !item.suitesAvailable.isNullOrBlank()
            binding.noPlacesBtn.isVisible = item.suitesAvailable.isNullOrBlank()
        }
    }

    private companion object Diff: DiffUtil.ItemCallback<Hotel>() {
        override fun areItemsTheSame(oldItem: Hotel, newItem: Hotel) = oldItem.same(newItem)
        override fun areContentsTheSame(oldItem: Hotel, newItem: Hotel) = oldItem.equals(newItem)
    }
}