package com.earl.remotedatasource

import com.earl.remotedatasource.models.HotelDetailsRemote
import com.earl.remotedatasource.models.HotelRemote
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface NetworkService {

    @GET
    suspend fun fetchHotels(
        @Url url: String
    ): List<HotelRemote>

    @GET
    suspend fun fetchHotelDetails(
        @Url url: String
    ): HotelDetailsRemote
}