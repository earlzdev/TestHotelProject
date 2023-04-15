package com.earl.hotel_search.presentation.hotelsSearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.Hotel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

class SearchHotelsViewModel(
    private val repository: Repository
): ViewModel() {

    private val _hotels: MutableStateFlow<List<Hotel>> = MutableStateFlow(emptyList())
    val hotels: StateFlow<List<Hotel>> = _hotels.asStateFlow()

    fun findHotels() {
        viewModelScope.launch(Dispatchers.IO) {
            _hotels.value = repository.fetchHotels()
        }
    }

    fun sortHotelsByDistance() {
        _hotels.value = hotels.value.sortedBy { hotel -> hotel.distance }
    }

    fun sortHotelsByFreePlacesAmount() {
        _hotels.value = hotels.value.sortedBy { hotel ->
            hotel.suitesAvailable.split(":").count()
        }.reversed()
    }

    @Feature
    class Factory @Inject constructor(
        private val repository: Provider<Repository>,
    ) : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            require(modelClass == SearchHotelsViewModel::class.java)
            return SearchHotelsViewModel(repository.get()) as T
        }
    }
}