package com.example.LoveCalculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/LoveCalculator/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.LoveCalculator.App.Companion Companion = null;
    public static com.example.LoveCalculator.room.AppDataBase appDataBase;
    public static com.example.LoveCalculator.network.LoveApi api;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/LoveCalculator/App$Companion;", "", "()V", "api", "Lcom/example/LoveCalculator/network/LoveApi;", "getApi", "()Lcom/example/LoveCalculator/network/LoveApi;", "setApi", "(Lcom/example/LoveCalculator/network/LoveApi;)V", "appDataBase", "Lcom/example/LoveCalculator/room/AppDataBase;", "getAppDataBase", "()Lcom/example/LoveCalculator/room/AppDataBase;", "setAppDataBase", "(Lcom/example/LoveCalculator/room/AppDataBase;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.LoveCalculator.room.AppDataBase getAppDataBase() {
            return null;
        }
        
        public final void setAppDataBase(@org.jetbrains.annotations.NotNull()
        com.example.LoveCalculator.room.AppDataBase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.LoveCalculator.network.LoveApi getApi() {
            return null;
        }
        
        public final void setApi(@org.jetbrains.annotations.NotNull()
        com.example.LoveCalculator.network.LoveApi p0) {
        }
    }
}