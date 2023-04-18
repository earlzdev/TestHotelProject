package com.earl.remotedatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig;", "", "Companion", "Endpoints", "remoteDataSource_debug"})
public abstract interface NetworkConfig {
    @org.jetbrains.annotations.NotNull()
    public static final com.earl.remotedatasource.NetworkConfig.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig$Endpoints;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "HotelDetailsFetcherUrl", "HotelFetcherUrl", "HotelImageFetcherUrl", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelDetailsFetcherUrl;", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelFetcherUrl;", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelImageFetcherUrl;", "remoteDataSource_debug"})
    public static abstract class Endpoints {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        private Endpoints(java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelFetcherUrl;", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints;", "()V", "remoteDataSource_debug"})
        public static final class HotelFetcherUrl extends com.earl.remotedatasource.NetworkConfig.Endpoints {
            @org.jetbrains.annotations.NotNull()
            public static final com.earl.remotedatasource.NetworkConfig.Endpoints.HotelFetcherUrl INSTANCE = null;
            
            private HotelFetcherUrl() {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelDetailsFetcherUrl;", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints;", "id", "", "(I)V", "remoteDataSource_debug"})
        public static final class HotelDetailsFetcherUrl extends com.earl.remotedatasource.NetworkConfig.Endpoints {
            
            public HotelDetailsFetcherUrl(int id) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig$Endpoints$HotelImageFetcherUrl;", "Lcom/earl/remotedatasource/NetworkConfig$Endpoints;", "id", "", "(Ljava/lang/String;)V", "remoteDataSource_debug"})
        public static final class HotelImageFetcherUrl extends com.earl.remotedatasource.NetworkConfig.Endpoints {
            
            public HotelImageFetcherUrl(@org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/earl/remotedatasource/NetworkConfig$Companion;", "", "()V", "fetchHotelDetailsUrl", "", "fetchHotelImageUrl", "fetchHotelsUrl", "remoteDataSource_debug"})
    public static final class Companion {
        private static final java.lang.String fetchHotelsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/0777.json";
        private static final java.lang.String fetchHotelDetailsUrl = "https://raw.githubusercontent.com/iMofas/ios-android-test/master/";
        private static final java.lang.String fetchHotelImageUrl = "https://github.com/iMofas/ios-android-test/raw/master/";
        
        private Companion() {
            super();
        }
    }
}