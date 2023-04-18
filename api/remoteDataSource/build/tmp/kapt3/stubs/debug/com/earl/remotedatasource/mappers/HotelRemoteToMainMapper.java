package com.earl.remotedatasource.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J=\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/earl/remotedatasource/mappers/HotelRemoteToMainMapper;", "T", "", "map", "id", "", "name", "", "address", "stars", "", "distance", "suites_availability", "(ILjava/lang/String;Ljava/lang/String;DDLjava/lang/String;)Ljava/lang/Object;", "remoteDataSource_debug"})
public abstract interface HotelRemoteToMainMapper<T extends java.lang.Object> {
    
    public abstract T map(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address, double stars, double distance, @org.jetbrains.annotations.NotNull()
    java.lang.String suites_availability);
}