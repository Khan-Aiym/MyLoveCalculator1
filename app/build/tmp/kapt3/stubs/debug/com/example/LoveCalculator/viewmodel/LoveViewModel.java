package com.example.LoveCalculator.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/LoveCalculator/viewmodel/LoveViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/LoveCalculator/repository/Repository;", "(Lcom/example/LoveCalculator/repository/Repository;)V", "getLiveModel", "Landroidx/lifecycle/LiveData;", "Lcom/example/LoveCalculator/model/LoveModel;", "fName", "", "sName", "app_debug"})
public final class LoveViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.LoveCalculator.repository.Repository repository = null;
    
    @javax.inject.Inject()
    public LoveViewModel(@org.jetbrains.annotations.NotNull()
    com.example.LoveCalculator.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.LoveCalculator.model.LoveModel> getLiveModel(@org.jetbrains.annotations.NotNull()
    java.lang.String fName, @org.jetbrains.annotations.NotNull()
    java.lang.String sName) {
        return null;
    }
}