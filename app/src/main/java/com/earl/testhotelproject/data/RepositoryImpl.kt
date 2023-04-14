package com.earl.testhotelproject.data

import com.earl.testhotelproject.data.remoteDataSource.NetworkService
import com.earl.testhotelproject.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val networkService: NetworkService
): Repository {


}