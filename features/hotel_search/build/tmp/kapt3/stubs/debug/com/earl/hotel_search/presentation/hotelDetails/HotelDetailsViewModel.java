package com.earl.hotel_search.presentation.hotelDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelDetails/HotelDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/earl/hotel_search/domain/Repository;", "(Lcom/earl/hotel_search/domain/Repository;)V", "_hotelDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/earl/hotel_search/domain/models/HotelDetails;", "hotelDetails", "Lkotlinx/coroutines/flow/StateFlow;", "getHotelDetails", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchHotelDetails", "", "hotelId", "", "Factory", "hotel_search_debug"})
public final class HotelDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.earl.hotel_search.domain.Repository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.earl.hotel_search.domain.models.HotelDetails> _hotelDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.earl.hotel_search.domain.models.HotelDetails> hotelDetails = null;
    
    public HotelDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.earl.hotel_search.domain.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.earl.hotel_search.domain.models.HotelDetails> getHotelDetails() {
        return null;
    }
    
    public final void fetchHotelDetails(int hotelId) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016\u00a2\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelDetails/HotelDetailsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Ljavax/inject/Provider;", "Lcom/earl/hotel_search/domain/Repository;", "(Ljavax/inject/Provider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "hotel_search_debug"})
    @com.earl.common.Feature()
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final javax.inject.Provider<com.earl.hotel_search.domain.Repository> repository = null;
        
        @javax.inject.Inject()
        public Factory(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.earl.hotel_search.domain.Repository> repository) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}