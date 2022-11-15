package com.example.LoveCalculator.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/LoveCalculator/repository/Repository;", "", "api", "Lcom/example/LoveCalculator/network/LoveApi;", "(Lcom/example/LoveCalculator/network/LoveApi;)V", "getCalculate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/LoveCalculator/model/LoveModel;", "fName", "", "sName", "app_debug"})
public final class Repository {
    private com.example.LoveCalculator.network.LoveApi api;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.LoveCalculator.network.LoveApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    public final androidx.lifecycle.MutableLiveData<com.example.LoveCalculator.model.LoveModel> getCalculate(@org.jetbrains.annotations.NotNull()
    java.lang.String fName, @org.jetbrains.annotations.NotNull()
    java.lang.String sName) {
        return null;
    }
}