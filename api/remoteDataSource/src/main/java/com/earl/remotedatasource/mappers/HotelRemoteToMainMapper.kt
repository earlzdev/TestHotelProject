package com.earl.remotedatasource.mappers

interface HotelRemoteToMainMapper<T> {

    fun map(
        id: Int,
        name: String,
        address: String,
        stars: Double,
        distance: Double,
        suites_availability: String
    ): T
}