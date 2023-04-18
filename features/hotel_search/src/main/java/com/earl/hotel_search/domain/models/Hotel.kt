package com.earl.hotel_search.domain.models

import com.earl.coreui.Same

data class Hotel(
    val id: Int,
    val name: String,
    val address: String,
    val stars: Double,
    val distance: Double,
    val suitesAvailable: String
): Same<Hotel> {
    override fun same(value: Hotel) = this == value
}
