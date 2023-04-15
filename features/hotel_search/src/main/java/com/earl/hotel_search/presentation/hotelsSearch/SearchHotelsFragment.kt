package com.earl.hotel_search.presentation.hotelsSearch

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.lifecycleScope
import com.earl.common.log
import com.earl.coreui.BaseFragment
import com.earl.hotel_search.databinding.FragmentSeatchHotelsBinding
import com.earl.hotel_search.di.SearchHotelsComponentViewModel
import com.earl.hotel_search.presentation.hotelDetails.HotelDetailsViewModel
import com.earl.hotel_search.presentation.utils.HotelsRecyclerAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class SearchHotelsFragment: BaseFragment<FragmentSeatchHotelsBinding>() {

    @Inject
    internal lateinit var searchAirportsViewModelFactory: dagger.Lazy<SearchHotelsViewModel.Factory>

    private val viewModel: SearchHotelsViewModel by viewModels {
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
        initHotelsRecycler()
    }

    private fun initHotelsRecycler() {
        val adapter = HotelsRecyclerAdapter()
        binding.hotelsRecycler.adapter = adapter
        viewModel.hotels.onEach { hotelsList ->
            binding.progressBar.isVisible = hotelsList.isEmpty()
            adapter.submitList(hotelsList)
        }.launchIn(lifecycleScope)
    }

    companion object {
        fun newInstance() = SearchHotelsFragment()
    }
}