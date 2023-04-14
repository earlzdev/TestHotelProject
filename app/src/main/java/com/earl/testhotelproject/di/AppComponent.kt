package com.earl.testhotelproject.di

import dagger.Component

@Component(
    modules = [
        BaseModule::class,
        MappersModule::class
    ]
)
interface AppComponent {


}