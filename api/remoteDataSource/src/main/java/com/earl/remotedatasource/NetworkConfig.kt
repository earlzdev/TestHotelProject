package com.earl.remotedatasource

interface NetworkConfig {

    companion object {
        private const val fetchHotelsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/0777.json"
    }

    sealed class Endpoints(val url: String) {
        object HotelFetcherUrl: Endpoints(fetchHotelsUrl)
    }
}