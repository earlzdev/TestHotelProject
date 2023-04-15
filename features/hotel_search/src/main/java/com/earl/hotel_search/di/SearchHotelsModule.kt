package com.earl.hotel_search.di

import com.earl.hotel_search.data.RepositoryImpl
import com.earl.hotel_search.data.mappers.BaseHotelRemoteToMainMapper
import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.Hotel
import com.earl.remotedatasource.NetworkService
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import dagger.Module
import dagger.Provides

@Module
class SearchHotelsModule {

    @Provides
    fun provideRepository(
        networkService: NetworkService,
        hotelRemoteToMainMapper: HotelRemoteToMainMapper<Hotel>
    ): Repository {
        return RepositoryImpl(
            networkService,
            hotelRemoteToMainMapper
        )
    }

    @Provides
    fun provideHotelRemoteToMainMapper(): HotelRemoteToMainMapper<Hotel> {
        return BaseHotelRemoteToMainMapper()
    }
}