package com.earl.remotedatasource.models

import com.earl.remotedatasource.mappers.HotelRemoteToMainMapper
import com.google.gson.annotations.SerializedName

data class HotelRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("address") val address: String,
    @SerializedName("stars") val stars: Double,
    @SerializedName("distance") val distance: Double,
    @SerializedName("suites_availability") val suitesAvailable: String
) {
    fun <T> mapToMain(mapper: HotelRemoteToMainMapper<T>) = mapper.map(
        id,
        name,
        address,
        stars,
        distance,
        suitesAvailable
    )
}