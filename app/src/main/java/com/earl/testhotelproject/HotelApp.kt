package com.earl.testhotelproject

import android.app.Application
import com.earl.hotel_search.di.SearchHotelsDepsStore
import com.earl.testhotelproject.di.AppComponent
import com.earl.testhotelproject.di.DaggerAppComponent

class HotelApp: Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        SearchHotelsDepsStore.deps = appComponent
    }
}