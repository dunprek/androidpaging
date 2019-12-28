package com.example.android.codelabs.paging.ui;

import java.lang.System;

/**
 * * View Holder for a [Repo] RecyclerView list item.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/codelabs/paging/ui/RepoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "forks", "language", "name", "repo", "Lcom/example/android/codelabs/paging/model/Repo;", "stars", "bind", "", "showRepoData", "Companion", "app_debug"})
public final class RepoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView name = null;
    private final android.widget.TextView description = null;
    private final android.widget.TextView stars = null;
    private final android.widget.TextView language = null;
    private final android.widget.TextView forks = null;
    private com.example.android.codelabs.paging.model.Repo repo;
    public static final com.example.android.codelabs.paging.ui.RepoViewHolder.Companion Companion = null;
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    com.example.android.codelabs.paging.model.Repo repo) {
    }
    
    private final void showRepoData(com.example.android.codelabs.paging.model.Repo repo) {
    }
    
    public RepoViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/codelabs/paging/ui/RepoViewHolder$Companion;", "", "()V", "create", "Lcom/example/android/codelabs/paging/ui/RepoViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.codelabs.paging.ui.RepoViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}