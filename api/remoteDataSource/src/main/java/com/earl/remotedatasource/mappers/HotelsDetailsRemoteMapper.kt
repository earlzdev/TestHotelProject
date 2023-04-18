package com.earl.remotedatasource.mappers

interface HotelsDetailsRemoteMapper<T> {

    fun map(
        id: Int,
        name: String,
        address: String,
        starts: Double,
        distance: Double,
        image: String,
        suites: String,
        lat: Double,
        long: Double
    ): T
}