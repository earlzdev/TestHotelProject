package com.earl.hotel_search.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/earl/hotel_search/domain/Repository;", "", "fetchHotelInfo", "Lcom/earl/hotel_search/domain/models/HotelDetails;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHotels", "", "Lcom/earl/hotel_search/domain/models/Hotel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotel_search_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchHotels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.earl.hotel_search.domain.models.Hotel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchHotelInfo(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.earl.hotel_search.domain.models.HotelDetails> continuation);
}