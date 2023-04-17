package com.earl.hotel_search.presentation.hotelDetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.lifecycleScope
import com.earl.coreui.BaseFragment
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
            }
        }.launchIn(lifecycleScope)
    }

    companion object {
        fun newInstance(hotelId: Int) = HotelDetailsFragment().apply {
            arguments = bundleOf("hotelId" to hotelId)
        }
    }
}