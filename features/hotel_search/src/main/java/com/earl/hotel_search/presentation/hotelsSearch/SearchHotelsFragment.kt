package com.earl.hotel_search.presentation.hotelsSearch

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.*
import android.widget.PopupMenu
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.net.toUri
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.earl.common.log
import com.earl.coreui.BaseFragment
import com.earl.coreui.NavigationUri
import com.earl.hotel_search.R
import com.earl.hotel_search.databinding.FragmentSeatchHotelsBinding
import com.earl.hotel_search.di.SearchHotelsComponentViewModel
import com.earl.hotel_search.presentation.hotelsSearch.utils.HotelsRecyclerAdapter
import com.earl.hotel_search.presentation.hotelsSearch.utils.OnHotelClickListener
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class SearchHotelsFragment: BaseFragment<FragmentSeatchHotelsBinding>(), OnHotelClickListener {

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
        viewModel.findHotels()
        initActionBar()
        initHotelsRecycler()
    }

    private fun initActionBar() {
        with(binding.actionBar) {
            title = requireContext().getString(R.string.hotels_search)
            setTitleTextColor(context.getColor(com.earl.coreui.R.color.search_hotels_text_color))
            binding.filter.setOnClickListener {
                val popupMenu = PopupMenu(requireContext(), binding.filter)
                popupMenu.menuInflater.inflate(R.menu.filter_menu, popupMenu.menu)
                popupMenu.setOnMenuItemClickListener { item ->
                    when (item.itemId) {
                        R.id.distance_from_center -> viewModel.sortHotelsByDistance()
                        R.id.free_places -> viewModel.sortHotelsByFreePlacesAmount()
                    }
                    true
                }
                popupMenu.show()
            }
        }
    }

    private fun initHotelsRecycler() {
        val adapter = HotelsRecyclerAdapter(this)
        binding.hotelsRecycler.adapter = adapter
        viewModel.hotels.onEach { hotelsList ->
            binding.progressBar.isVisible = hotelsList.isEmpty()
            adapter.submitList(hotelsList)
        }.launchIn(lifecycleScope)
    }

    override fun onHotelClick(hotelId: Int) {
        val request = NavDeepLinkRequest.Builder
            .fromUri(
                NavigationUri.HotelDetailsFragmentTransaction(NavigationUri.hotelsSearchToHotelDetails)
                    .moveToHotelDetailsFragment(hotelId).toUri()
            )
            .build()
        findNavController().navigate(request)
    }
}