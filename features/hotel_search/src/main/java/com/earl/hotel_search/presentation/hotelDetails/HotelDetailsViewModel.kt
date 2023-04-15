package com.earl.hotel_search.presentation.hotelDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject
import javax.inject.Provider

class HotelDetailsViewModel(
    private val repository: Repository
): ViewModel() {

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