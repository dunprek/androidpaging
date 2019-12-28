package com.example.android.codelabs.paging.api;

import java.lang.System;

/**
 * * Data class to hold repo responses from searchRepo API calls.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/codelabs/paging/api/RepoSearchResponse;", "", "total", "", "items", "", "Lcom/example/android/codelabs/paging/model/Repo;", "nextPage", "(ILjava/util/List;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotal", "()I", "component1", "component2", "component3", "copy", "(ILjava/util/List;Ljava/lang/Integer;)Lcom/example/android/codelabs/paging/api/RepoSearchResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class RepoSearchResponse {
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.List<com.example.android.codelabs.paging.model.Repo> items = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer nextPage = null;
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.codelabs.paging.model.Repo> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNextPage() {
        return null;
    }
    
    public RepoSearchResponse(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.codelabs.paging.model.Repo> items, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nextPage) {
        super();
    }
    
    public RepoSearchResponse() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.codelabs.paging.model.Repo> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    /**
     * * Data class to hold repo responses from searchRepo API calls.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.codelabs.paging.api.RepoSearchResponse copy(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.codelabs.paging.model.Repo> items, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nextPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}