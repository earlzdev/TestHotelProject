package com.earl.hotel_search.data.mappers

import com.earl.hotel_search.domain.models.Hotel
import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import javax.inject.Inject

class BaseHotelRemoteToMainMapper @Inject constructor(): HotelRemoteToMainMapper<Hotel> {

    override fun map(
        id: Int,
        name: String,
        address: String,
        stars: Double,
        distance: Double,
        suites_availability: String
    ) = Hotel(
        id,
        name,
        address,
        stars,
        distance,
        suites_availability
    )
}