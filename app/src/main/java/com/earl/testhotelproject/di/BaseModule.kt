package com.earl.testhotelproject.di

import com.earl.testhotelproject.data.RepositoryImpl
import com.earl.testhotelproject.data.remoteDataSource.NetworkService
import com.earl.testhotelproject.data.remoteDataSource.buildNetworkService
import com.earl.testhotelproject.domain.Repository
import dagger.Module
import dagger.Provides

@Module
class BaseModule {

    @Provides
    fun provideRepository(
        networkService: NetworkService
    ): Repository {
        return RepositoryImpl(
            networkService
        )
    }

    @Provides
    fun provideNetworkService() = buildNetworkService()
}