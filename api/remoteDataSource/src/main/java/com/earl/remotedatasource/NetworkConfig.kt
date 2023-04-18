package com.earl.remotedatasource

interface NetworkConfig {

    companion object {
        private const val fetchHotelsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/0777.json"
        private const val fetchHotelDetailsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/"
        private const val fetchHotelImageUrl = "https://github.com/iMofas/ios-android-test/raw/master/"
    }

    sealed class Endpoints(val url: String) {
        object HotelFetcherUrl: Endpoints(fetchHotelsUrl)
        class HotelDetailsFetcherUrl(id: Int): Endpoints("$fetchHotelDetailsUrl$id.json")
        class HotelImageFetcherUrl(id: String): Endpoints("$fetchHotelImageUrl$id")
    }
}