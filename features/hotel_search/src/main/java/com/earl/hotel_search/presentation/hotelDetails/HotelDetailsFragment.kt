package com.earl.hotel_search.presentation.hotelDetails

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
import com.earl.coreui.BaseFragment
import com.earl.coreui.GlideLoadingLinks
import com.earl.hotel_search.R
import com.earl.hotel_search.databinding.FragmentHotelDetailsBinding
import com.earl.hotel_search.di.SearchHotelsComponentViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class HotelDetailsFragment: BaseFragment<FragmentHotelDetailsBinding>() {

    @Inject
    internal lateinit var searchAirportsViewModelFactory: dagger.Lazy<HotelDetailsViewModel.Factory>

    private val viewModel: HotelDetailsViewModel by viewModels {
        searchAirportsViewModelFactory.get()
    }

    override fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentHotelDetailsBinding.inflate(inflater, container, false)

    override fun onAttach(context: Context) {
        ViewModelProvider(this).get<SearchHotelsComponentViewModel>()
            .searchHotelsComponent.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchHotelDetails()
        initHotelInfo()
        binding.backBtn.setOnClickListener { findNavController().popBackStack() }
    }

    private fun fetchHotelDetails() {
        arguments?.getInt("hotelId").let {hotelId ->
            if (hotelId != null) {
                viewModel.fetchHotelDetails(hotelId)
            }
        }
    }

    private fun initHotelInfo() {
        viewModel.hotelDetails.onEach { hotelDetails ->
            if (hotelDetails != null) {
                binding.hotelAddress.text = String.format(requireContext().getString(R.string.hotel_address), hotelDetails.address)
                binding.hotelName.text = String.format(requireContext().getString(R.string.hotel_title), hotelDetails.name)
                binding.hotelDistanceFromCenter.text = String.format(requireContext().getString(R.string.distance_from_center_text), hotelDetails.distance)
                binding.ratingBar.rating = hotelDetails.starts.toFloat()
                binding.freePlaces.text = String.format(requireContext().getString(R.string.free_places_in_hotel_details), hotelDetails.suites.replace(":", ", "))
                if (hotelDetails.image.isNotBlank()) {
                    Glide.with(binding.hotelImage)
                        .asBitmap()
                        .load(GlideLoadingLinks.hotelImageLInk.plus(hotelDetails.image))
                        .addListener(object: RequestListener<Bitmap> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Bitmap>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                binding.errorWhileLoadingImage.visibility = View.VISIBLE
                                binding.progressBar.visibility = View.GONE
                                return false
                            }
                            override fun onResourceReady(
                                resource: Bitmap?,
                                model: Any?,
                                target: Target<Bitmap>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                cropImage(resource!!)
                                return true
                            }
                        })
                        .centerCrop()
                        .into(object : CustomTarget<Bitmap>() {
                            override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                                cropImage(resource)
                            }
                            override fun onLoadCleared(placeholder: Drawable?) {}
                        })
                    binding.progressBar.visibility = View.GONE
                } else {
                    binding.progressBar.visibility = View.GONE
                    binding.noImageFoundText.visibility = View.VISIBLE
                }
            }
        }.launchIn(lifecycleScope)
    }

    private fun cropImage(resource: Bitmap) {
        val width = resource.width
        val height = resource.height
        val newWidth = width - 2
        val newHeight = height - 2
        val croppedBitmap = Bitmap.createBitmap(resource, 1, 1, newWidth, newHeight)
        binding.hotelImage.setImageBitmap(croppedBitmap)
    }
}