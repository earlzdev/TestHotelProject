package com.earl.hotel_search.presentation.hotelsSearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelsSearch/SearchHotelsFragment;", "Lcom/earl/coreui/BaseFragment;", "Lcom/earl/hotel_search/databinding/FragmentSeatchHotelsBinding;", "Lcom/earl/hotel_search/presentation/hotelsSearch/utils/OnHotelClickListener;", "()V", "searchAirportsViewModelFactory", "Ldagger/Lazy;", "Lcom/earl/hotel_search/presentation/hotelsSearch/SearchHotelsViewModel$Factory;", "getSearchAirportsViewModelFactory$hotel_search_debug", "()Ldagger/Lazy;", "setSearchAirportsViewModelFactory$hotel_search_debug", "(Ldagger/Lazy;)V", "viewModel", "Lcom/earl/hotel_search/presentation/hotelsSearch/SearchHotelsViewModel;", "getViewModel", "()Lcom/earl/hotel_search/presentation/hotelsSearch/SearchHotelsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initActionBar", "", "initHotelsRecycler", "onAttach", "context", "Landroid/content/Context;", "onHotelClick", "hotelId", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "viewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "hotel_search_debug"})
public final class SearchHotelsFragment extends com.earl.coreui.BaseFragment<com.earl.hotel_search.databinding.FragmentSeatchHotelsBinding> implements com.earl.hotel_search.presentation.hotelsSearch.utils.OnHotelClickListener {
    @javax.inject.Inject()
    public dagger.Lazy<com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsViewModel.Factory> searchAirportsViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public SearchHotelsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsViewModel.Factory> getSearchAirportsViewModelFactory$hotel_search_debug() {
        return null;
    }
    
    public final void setSearchAirportsViewModelFactory$hotel_search_debug(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsViewModel.Factory> p0) {
    }
    
    private final com.earl.hotel_search.presentation.hotelsSearch.SearchHotelsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.earl.hotel_search.databinding.FragmentSeatchHotelsBinding viewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initActionBar() {
    }
    
    private final void initHotelsRecycler() {
    }
    
    @java.lang.Override()
    public void onHotelClick(int hotelId) {
    }
}