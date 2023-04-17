package com.earl.hotel_search.data

import com.earl.hotel_search.domain.Repository
import com.earl.hotel_search.domain.models.Hotel
import com.earl.hotel_search.domain.models.HotelDetails
import com.earl.remotedatasource.NetworkConfig
import com.earl.remotedatasource.NetworkService
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val networkService: NetworkService,
    private val hotelRemoteToMainMapper: HotelRemoteToMainMapper<Hotel>,
    private val hotelDetailsRemoteToMainMapper: HotelsDetailsRemoteMapper<HotelDetails>
): Repository {

    override suspend fun fetchHotels(): List<Hotel> {
        return networkService.fetchHotels(NetworkConfig.Endpoints.HotelFetcherUrl.url).map {
            it.mapToMain(hotelRemoteToMainMapper)
        }
    }

    override suspend fun fetchHotelInfo(id: Int): HotelDetails =
        networkService.fetchHotelDetails(NetworkConfig.Endpoints.HotelDetailsFetcherUrl(id).url)
            .map(hotelDetailsRemoteToMainMapper)
}