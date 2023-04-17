package com.earl.remotedatasource

interface NetworkConfig {

    companion object {
        private const val fetchHotelsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/0777.json"
        private const val fetchHotelDetailsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/"
    }

    sealed class Endpoints(val url: String) {
        object HotelFetcherUrl: Endpoints(fetchHotelsUrl)
        class HotelDetailsFetcherUrl(id: Int): Endpoints("$fetchHotelDetailsUrl$id.json")
    }
}