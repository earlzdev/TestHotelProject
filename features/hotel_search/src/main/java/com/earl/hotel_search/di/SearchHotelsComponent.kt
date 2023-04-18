package com.earl.hotel_search.di

import androidx.annotation.RestrictTo
import androidx.lifecycle.ViewModel
import com.earl.common.Feature
import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.presentation.hotelDetails.HotelDetailsFragment
import com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsFragment
import dagger.Component
import kotlin.properties.Delegates

@[Feature Component(dependencies = [SearchHotelsDeps::class])]
interface SearchHotelsComponent {

    fun inject(fragment: SearchHotelsFragment)

    fun inject(fragment: HotelDetailsFragment)

    @Component.Builder
    interface Builder {

        fun deps(searchAirportsDeps: SearchHotelsDeps) : Builder

        fun build() : SearchHotelsComponent
    }
}


interface SearchHotelsDeps {

    val repository: Repository
}

interface SearchHotelsDepsProvider {

    @get:RestrictTo(RestrictTo.Scope.LIBRARY)
    val deps: SearchHotelsDeps

    companion object : SearchHotelsDepsProvider by SearchHotelsDepsStore
}

object SearchHotelsDepsStore : SearchHotelsDepsProvider {

    override var deps: SearchHotelsDeps by Delegates.notNull()
}

internal class SearchHotelsComponentViewModel : ViewModel() {

    val searchHotelsComponent =
        DaggerSearchHotelsComponent.builder().deps(SearchHotelsDepsProvider.deps).build()
}