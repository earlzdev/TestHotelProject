package com.earl.testhotelproject.di

import com.earl.remotedatasource.buildNetworkService
import dagger.Module
import dagger.Provides

@Module
class BaseModule {

    @Provides
    fun provideNetworkService() = buildNetworkService()
}