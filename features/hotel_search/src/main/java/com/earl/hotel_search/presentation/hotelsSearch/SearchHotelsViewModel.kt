package com.earl.hotel_search.presentation.hotelsSearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject
import javax.inject.Provider

class SearchHotelsViewModel(
    private val repository: Repository
): ViewModel() {

    val hotels = flow {
        try {
            emit(repository.fetchHotels())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

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