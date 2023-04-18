package com.earl.hotel_search.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/earl/hotel_search/data/RepositoryImpl;", "Lcom/earl/hotel_search/domain/Repository;", "networkService", "Lcom/earl/remotedatasource/NetworkService;", "hotelRemoteToMainMapper", "Lcom/earl/remotedatasource/mappers/HotelRemoteToMainMapper;", "Lcom/earl/hotel_search/domain/models/Hotel;", "hotelDetailsRemoteToMainMapper", "Lcom/earl/remotedatasource/mappers/HotelsDetailsRemoteMapper;", "Lcom/earl/hotel_search/domain/models/HotelDetails;", "(Lcom/earl/remotedatasource/NetworkService;Lcom/earl/remotedatasource/mappers/HotelRemoteToMainMapper;Lcom/earl/remotedatasource/mappers/HotelsDetailsRemoteMapper;)V", "fetchHotelInfo", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHotels", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotel_search_debug"})
public final class RepositoryImpl implements com.earl.hotel_search.domain.Repository {
    private final com.earl.remotedatasource.NetworkService networkService = null;
    private final com.earl.remotedatasource.mappers.HotelRemoteToMainMapper<com.earl.hotel_search.domain.models.Hotel> hotelRemoteToMainMapper = null;
    private final com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper<com.earl.hotel_search.domain.models.HotelDetails> hotelDetailsRemoteToMainMapper = null;
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.NetworkService networkService, @org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.mappers.HotelRemoteToMainMapper<com.earl.hotel_search.domain.models.Hotel> hotelRemoteToMainMapper, @org.jetbrains.annotations.NotNull()
    com.earl.remotedatasource.mappers.HotelsDetailsRemoteMapper<com.earl.hotel_search.domain.models.HotelDetails> hotelDetailsRemoteToMainMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchHotels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.earl.hotel_search.domain.models.Hotel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchHotelInfo(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.earl.hotel_search.domain.models.HotelDetails> continuation) {
        return null;
    }
}