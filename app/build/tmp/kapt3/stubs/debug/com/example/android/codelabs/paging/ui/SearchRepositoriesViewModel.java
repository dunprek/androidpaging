package com.example.android.codelabs.paging.ui;

import java.lang.System;

/**
 * * ViewModel for the [SearchRepositoriesActivity] screen.
 * * The ViewModel works with the [GithubRepository] to get the data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/android/codelabs/paging/ui/SearchRepositoriesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/android/codelabs/paging/data/GithubRepository;", "(Lcom/example/android/codelabs/paging/data/GithubRepository;)V", "networkErrors", "Landroidx/lifecycle/LiveData;", "", "getNetworkErrors", "()Landroidx/lifecycle/LiveData;", "queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "repoResult", "Lcom/example/android/codelabs/paging/model/RepoSearchResult;", "repos", "Landroidx/paging/PagedList;", "Lcom/example/android/codelabs/paging/model/Repo;", "getRepos", "lastQueryValue", "searchRepo", "", "queryString", "app_debug"})
public final class SearchRepositoriesViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryLiveData = null;
    private final androidx.lifecycle.LiveData<com.example.android.codelabs.paging.model.RepoSearchResult> repoResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.android.codelabs.paging.model.Repo>> repos = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> networkErrors = null;
    private final com.example.android.codelabs.paging.data.GithubRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.android.codelabs.paging.model.Repo>> getRepos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNetworkErrors() {
        return null;
    }
    
    /**
     * * Search a repository based on a query string.
     */
    public final void searchRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
    }
    
    /**
     * * Get the last query value.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String lastQueryValue() {
        return null;
    }
    
    public SearchRepositoriesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.data.GithubRepository repository) {
        super();
    }
}