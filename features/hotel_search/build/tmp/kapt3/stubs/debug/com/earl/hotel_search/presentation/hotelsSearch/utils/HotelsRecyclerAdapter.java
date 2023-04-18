package com.earl.hotel_search.presentation.hotelsSearch.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelsSearch/utils/HotelsRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/earl/hotel_search/domain/models/Hotel;", "Lcom/earl/hotel_search/presentation/hotelsSearch/utils/HotelsRecyclerAdapter$ItemViewHolder;", "clickListener", "Lcom/earl/hotel_search/presentation/hotelsSearch/utils/OnHotelClickListener;", "(Lcom/earl/hotel_search/presentation/hotelsSearch/utils/OnHotelClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Diff", "ItemViewHolder", "hotel_search_debug"})
public final class HotelsRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.earl.hotel_search.domain.models.Hotel, com.earl.hotel_search.presentation.hotelsSearch.utils.HotelsRecyclerAdapter.ItemViewHolder> {
    private final com.earl.hotel_search.presentation.hotelsSearch.utils.OnHotelClickListener clickListener = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.earl.hotel_search.presentation.hotelsSearch.utils.HotelsRecyclerAdapter.Diff Diff = null;
    
    public HotelsRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.earl.hotel_search.presentation.hotelsSearch.utils.OnHotelClickListener clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.earl.hotel_search.presentation.hotelsSearch.utils.HotelsRecyclerAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.earl.hotel_search.presentation.hotelsSearch.utils.HotelsRecyclerAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelsSearch/utils/HotelsRecyclerAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/earl/hotel_search/databinding/RecyclerHotelItemBinding;", "(Lcom/earl/hotel_search/presentation/hotelsSearch/utils/HotelsRecyclerAdapter;Lcom/earl/hotel_search/databinding/RecyclerHotelItemBinding;)V", "bind", "", "item", "Lcom/earl/hotel_search/domain/models/Hotel;", "hotel_search_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.earl.hotel_search.databinding.RecyclerHotelItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.databinding.RecyclerHotelItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.domain.models.Hotel item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/earl/hotel_search/presentation/hotelsSearch/utils/HotelsRecyclerAdapter$Diff;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/earl/hotel_search/domain/models/Hotel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "hotel_search_debug"})
    static final class Diff extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.earl.hotel_search.domain.models.Hotel> {
        
        private Diff() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.domain.models.Hotel oldItem, @org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.domain.models.Hotel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.domain.models.Hotel oldItem, @org.jetbrains.annotations.NotNull()
        com.earl.hotel_search.domain.models.Hotel newItem) {
            return false;
        }
    }
}