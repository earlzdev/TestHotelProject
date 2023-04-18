package com.earl.hotel_search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/earl/hotel_search/di/SearchHotelsModule;", "", "()V", "provideHotelDetailsRemoteToMainMapper", "Lcom/earl/remotedatasource/mappers/HotelsDetailsRemoteMapper;", "Lcom/earl/hotel_search/domain/models/HotelDetails;", "provideHotelRemoteToMainMapper", "Lcom/earl/remotedatasource/mappers/HotelRemoteToMainMapper;", "Lcom/earl/hotel_search/domain/models/Hotel;", "provideRepository", "Lcom/earl/hotel_search/domain/Repository;", "networkService", "Lcom/earl/remotedatasource/NetworkService;", "hotelRemoteToMainMapper", "hotelDetailsRemoteToMainMapper", "hotel_search_debug"})
@dagger.Module()
public final class SearchHotelsModule {
    
    public SearchHotelsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.earl.hotel_search.domain.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.NetworkService networkService, @org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.mappers.HotelRemoteToMainMapper<com.earl.hotel_search.domain.models.Hotel> hotelRemoteToMainMapper, @org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper<com.earl.hotel_search.domain.models.HotelDetails> hotelDetailsRemoteToMainMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.earl.remotedatasource.mappers.HotelRemoteToMainMapper<com.earl.hotel_search.domain.models.Hotel> provideHotelRemoteToMainMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper<com.earl.hotel_search.domain.models.HotelDetails> provideHotelDetailsRemoteToMainMapper() {
        return null;
    }
}