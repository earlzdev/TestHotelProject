package com.earl.hotel_search.data

import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.Hotel
import com.earl.remotedatasource.NetworkConfig
import com.earl.remotedatasource.NetworkService
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val networkService: NetworkService,
    private val hotelRemoteToMainMapper: HotelRemoteToMainMapper<Hotel>
): Repository {

    override suspend fun fetchHotels(): List<Hotel> {
        return networkService.fetchHotels(NetworkConfig.Endpoints.HotelFetcherUrl.url).map {
            it.mapToMain(hotelRemoteToMainMapper)
        }
    }
}