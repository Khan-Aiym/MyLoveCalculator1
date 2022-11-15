package com.example.LoveCalculator.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/LoveCalculator/network/LoveApi;", "", "calculateName", "Lretrofit2/Call;", "Lcom/example/LoveCalculator/model/LoveModel;", "fName", "", "sName", "key", "host", "app_debug"})
public abstract interface LoveApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getPercentage")
    public abstract retrofit2.Call<com.example.LoveCalculator.model.LoveModel> calculateName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fname")
    java.lang.String fName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sname")
    java.lang.String sName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "X-RapidAPI-Key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "X-RapidAPI-Host")
    java.lang.String host);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}