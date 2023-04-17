package com.earl.remotedatasource.models

import com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper
import com.google.gson.annotations.SerializedName

data class HotelDetailsRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("address") val address: String,
    @SerializedName("stars") val starts: Double,
    @SerializedName("distance") val distance: Double,
    @SerializedName("image") val image: String,
    @SerializedName("suites_availability") val suites: String,
    @SerializedName("lat") val lat: Double,
    @SerializedName("lon")val long: Double
) {
    fun <T> map(mapper: HotelsDetailsRemoteMapper<T>) =
        mapper.map(id, name, address, starts, distance, image, suites, lat, long)
}
