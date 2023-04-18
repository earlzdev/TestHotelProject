package com.earl.hotel_search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/earl/hotel_search/di/SearchHotelsComponent;", "", "inject", "", "fragment", "Lcom/earl/hotel_search/presentation/hotelDetails/HotelDetailsFragment;", "Lcom/earl/hotel_search/presentation/hotelsSearch/SearchHotelsFragment;", "Builder", "hotel_search_debug"})
@dagger.Component(dependencies = {com.earl.hotel_search.di.SearchHotelsDeps.class})
@com.earl.common.Feature()
public abstract interface SearchHotelsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.earl.hotel_search.presentation.hotelDetails.HotelDetailsFragment fragment);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/earl/hotel_search/di/SearchHotelsComponent$Builder;", "", "build", "Lcom/earl/hotel_search/di/SearchHotelsComponent;", "deps", "searchAirportsDeps", "Lcom/earl/hotel_search/di/SearchHotelsDeps;", "hotel_search_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.earl.hotel_search.di.SearchHotelsComponent.Builder deps(@org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.di.SearchHotelsDeps searchAirportsDeps);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.earl.hotel_search.di.SearchHotelsComponent build();
    }
}