package com.earl.hotel_search.di

import com.earl.hotel_search.data.RepositoryImpl
import com.earl.hotel_search.data.mappers.BaseHotelDetailsRemoteToMainMapper
import com.earl.hotel_search.data.mappers.BaseHotelRemoteToMainMapper
import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.Hotel
import com.earl.hotel_search.domain.models.HotelDetails
import com.earl.remotedatasource.NetworkService
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper
import dagger.Module
import dagger.Provides

@Module
class SearchHotelsModule {

    @Provides
    fun provideRepository(
        networkService: NetworkService,
        hotelRemoteToMainMapper: HotelRemoteToMainMapper<Hotel>,
        hotelDetailsRemoteToMainMapper: HotelsDetailsRemoteMapper<HotelDetails>
    ): Repository {
        return RepositoryImpl(
            networkService,
            hotelRemoteToMainMapper,
            hotelDetailsRemoteToMainMapper
        )
    }

    @Provides
    fun provideHotelRemoteToMainMapper(): HotelRemoteToMainMapper<Hotel> {
        return BaseHotelRemoteToMainMapper()
    }

    @Provides
    fun provideHotelDetailsRemoteToMainMapper(): HotelsDetailsRemoteMapper<HotelDetails> {
        return BaseHotelDetailsRemoteToMainMapper()
    }
}