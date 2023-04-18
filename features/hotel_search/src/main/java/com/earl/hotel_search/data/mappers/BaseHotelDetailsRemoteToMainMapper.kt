package com.earl.hotel_search.data.mappers

import com.earl.hotel_search.domain.models.HotelDetails
import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper
import javax.inject.Inject

class BaseHotelDetailsRemoteToMainMapper @Inject constructor(): HotelsDetailsRemoteMapper<HotelDetails> {

    override fun map(
        id: Int,
        name: String,
        address: String,
        starts: Double,
        distance: Double,
        image: String,
        suites: String,
        lat: Double,
        long: Double
    ) = HotelDetails(
        id,
        name,
        address,
        starts,
        distance,
        image,
        suites,
        lat,
        long
    )
}