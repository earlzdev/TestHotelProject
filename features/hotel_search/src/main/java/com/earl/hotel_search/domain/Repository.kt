package com.earl.hotel_search.domain

import com.earl.hotel_search.domain.models.Hotel

interface Repository {

    suspend fun fetchHotels(): List<Hotel>
}