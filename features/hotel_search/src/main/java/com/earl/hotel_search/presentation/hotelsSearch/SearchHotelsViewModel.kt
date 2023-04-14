package com.earl.hotel_search.presentation.hotelsSearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import javax.inject.Inject
import javax.inject.Provider

class SearchHotelsViewModel(
    private val repository: Repository
): ViewModel() {

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