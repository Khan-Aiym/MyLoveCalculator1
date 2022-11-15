package com.example.LoveCalculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/LoveCalculator/OnBoardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/LoveCalculator/OnBoardAdapter$OnBoardViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/example/LoveCalculator/board/OnBoardModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnBoardViewHolder", "app_debug"})
public final class OnBoardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.LoveCalculator.OnBoardAdapter.OnBoardViewHolder> {
    private final java.util.ArrayList<com.example.LoveCalculator.board.OnBoardModel> list = null;
    
    public OnBoardAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.LoveCalculator.board.OnBoardModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.LoveCalculator.OnBoardAdapter.OnBoardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.LoveCalculator.OnBoardAdapter.OnBoardViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/LoveCalculator/OnBoardAdapter$OnBoardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mylovecalculator/databinding/ItemOnboardBinding;", "(Lcom/example/LoveCalculator/OnBoardAdapter;Lcom/example/mylovecalculator/databinding/ItemOnboardBinding;)V", "onBind", "", "model", "Lcom/example/LoveCalculator/board/OnBoardModel;", "app_debug"})
    public final class OnBoardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.mylovecalculator.databinding.ItemOnboardBinding binding = null;
        
        public OnBoardViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mylovecalculator.databinding.ItemOnboardBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.LoveCalculator.board.OnBoardModel model) {
        }
    }
}