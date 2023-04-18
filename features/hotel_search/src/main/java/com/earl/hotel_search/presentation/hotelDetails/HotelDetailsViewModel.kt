package com.earl.hotel_search.presentation.hotelDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.HotelDetails
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

class HotelDetailsViewModel(
    private val repository: Repository
): ViewModel() {

    private val _hotelDetails: MutableStateFlow<HotelDetails?> = MutableStateFlow(null)
    val hotelDetails: StateFlow<HotelDetails?> = _hotelDetails.asStateFlow()

    fun fetchHotelDetails(hotelId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            _hotelDetails.value = repository.fetchHotelInfo(hotelId)
        }
    }

    @Feature
    class Factory @Inject constructor(
        private val repository: Provider<Repository>,
    ) : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            require(modelClass == HotelDetailsViewModel::class.java)
            return HotelDetailsViewModel(repository.get()) as T
        }
    }
}