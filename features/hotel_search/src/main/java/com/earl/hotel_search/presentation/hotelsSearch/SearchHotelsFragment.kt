package com.earl.hotel_search.presentation.hotelsSearch

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.earl.coreui.BaseFragment
import com.earl.hotel_search.databinding.FragmentSeatchHotelsBinding
import com.earl.hotel_search.di.SearchHotelsComponentViewModel
import com.earl.hotel_search.presentation.hotelDetails.HotelDetailsViewModel
import javax.inject.Inject

class SearchHotelsFragment: BaseFragment<FragmentSeatchHotelsBinding>() {

    @Inject
    internal lateinit var searchAirportsViewModelFactory: dagger.Lazy<HotelDetailsViewModel.Factory>

    private val viewModel: HotelDetailsViewModel by viewModels {
        searchAirportsViewModelFactory.get()
    }

    override fun viewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentSeatchHotelsBinding.inflate(inflater, container, false)

    override fun onAttach(context: Context) {
        ViewModelProvider(this).get<SearchHotelsComponentViewModel>()
            .searchHotelsComponent.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}