package com.earl.hotel_search.data

import com.earl.remotedatasource.NetworkService
import com.earl.hotel_search.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val networkService: com.earl.remotedatasource.NetworkService
): Repository {


}