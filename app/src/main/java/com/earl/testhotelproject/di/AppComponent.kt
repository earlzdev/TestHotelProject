package com.earl.testhotelproject.di

import android.app.Application
import com.earl.common.AppScope
import com.earl.hotel_search.di.SearchHotelsDeps
import com.earl.hotel_search.di.SearchHotelsModule
import dagger.BindsInstance
import dagger.Component

@[AppScope Component(modules = [
    BaseModule::class,
    SearchHotelsModule::class
])]
interface AppComponent: SearchHotelsDeps {


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : Builder

        fun build() : AppComponent
    }
}