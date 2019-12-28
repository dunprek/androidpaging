package com.example.android.codelabs.paging.data;

import java.lang.System;

/**
 * * This boundary callback gets notified when user reaches to the edges of the list for example when
 * * the database cannot provide any more data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/codelabs/paging/data/RepoBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/example/android/codelabs/paging/model/Repo;", "query", "", "service", "Lcom/example/android/codelabs/paging/api/GithubService;", "cache", "Lcom/example/android/codelabs/paging/db/GithubLocalCache;", "(Ljava/lang/String;Lcom/example/android/codelabs/paging/api/GithubService;Lcom/example/android/codelabs/paging/db/GithubLocalCache;)V", "_networkErrors", "Landroidx/lifecycle/MutableLiveData;", "isRequestInProgress", "", "lastRequestedPage", "", "networkErrors", "Landroidx/lifecycle/LiveData;", "getNetworkErrors", "()Landroidx/lifecycle/LiveData;", "onItemAtEndLoaded", "", "itemAtEnd", "onZeroItemsLoaded", "requestAndSaveData", "Companion", "app_debug"})
public final class RepoBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<com.example.android.codelabs.paging.model.Repo> {
    private int lastRequestedPage;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _networkErrors = null;
    private boolean isRequestInProgress;
    private final java.lang.String query = null;
    private final com.example.android.codelabs.paging.api.GithubService service = null;
    private final com.example.android.codelabs.paging.db.GithubLocalCache cache = null;
    private static final int NETWORK_PAGE_SIZE = 50;
    public static final com.example.android.codelabs.paging.data.RepoBoundaryCallback.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNetworkErrors() {
        return null;
    }
    
    /**
     * * Database returned 0 items. We should query the backend for more items.
     */
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    /**
     * * When all items in the database were loaded, we need to query the backend for more items.
     */
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.model.Repo itemAtEnd) {
    }
    
    private final void requestAndSaveData(java.lang.String query) {
    }
    
    public RepoBoundaryCallback(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.api.GithubService service, @org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.db.GithubLocalCache cache) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/codelabs/paging/data/RepoBoundaryCallback$Companion;", "", "()V", "NETWORK_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}