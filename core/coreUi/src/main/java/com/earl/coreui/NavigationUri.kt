package com.earl.coreui

object NavigationUri {

    const val hotelsSearchToHotelDetails = "android-app://com.earl.hotel_search.presentation/HotelDetailsFragment/"

    class HotelDetailsFragmentTransaction(private val url: String) {
        fun moveToHotelDetailsFragment(hotelId: Int): String = url.plus(hotelId)
    }
}