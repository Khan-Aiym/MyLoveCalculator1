package com.example.LoveCalculator.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/LoveCalculator/room/Dao;", "", "getLove", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/LoveCalculator/model/LoveModel;", "insert", "", "loveModel", "sort", "app_debug"})
public abstract interface Dao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.LoveCalculator.model.LoveModel loveModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM love_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.LoveCalculator.model.LoveModel>> getLove();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM love_table ORDER BY fName ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.LoveCalculator.model.LoveModel>> sort();
}