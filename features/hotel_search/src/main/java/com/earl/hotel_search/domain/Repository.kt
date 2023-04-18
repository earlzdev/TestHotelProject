package com.earl.hotel_search.domain

import com.earl.hotel_search.domain.models.Hotel
import com.earl.hotel_search.domain.models.HotelDetails

interface Repository {

    suspend fun fetchHotels(): List<Hotel>

    suspend fun fetchHotelInfo(id: Int): HotelDetails
}