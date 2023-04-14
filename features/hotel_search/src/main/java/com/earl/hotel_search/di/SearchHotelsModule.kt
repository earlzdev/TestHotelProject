package com.earl.hotel_search.di

import com.earl.hotel_search.data.RepositoryImpl
import com.earl.hotel_search.domain.Repository
import com.earl.remotedatasource.NetworkService
import dagger.Module
import dagger.Provides

@Module
class SearchHotelsModule {

    @Provides
    fun provideRepository(
        networkService: NetworkService
    ): Repository {
        return RepositoryImpl(
            networkService
        )
    }
}