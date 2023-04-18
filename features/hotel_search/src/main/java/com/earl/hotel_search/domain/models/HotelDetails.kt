package com.earl.hotel_search.domain.models

data class HotelDetails(
    val id: Int,
    val name: String,
    val address: String,
    val starts: Double,
    val distance: Double,
    val image: String,
    val suites: String,
    val lat: Double,
    val long: Double
)