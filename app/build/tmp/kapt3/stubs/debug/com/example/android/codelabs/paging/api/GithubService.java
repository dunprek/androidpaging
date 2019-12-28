package com.example.android.codelabs.paging.api;

import java.lang.System;

/**
 * * Github API communication setup via Retrofit.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/codelabs/paging/api/GithubService;", "", "searchRepos", "Lretrofit2/Call;", "Lcom/example/android/codelabs/paging/api/RepoSearchResponse;", "query", "", "page", "", "itemsPerPage", "Companion", "app_debug"})
public abstract interface GithubService {
    public static final com.example.android.codelabs.paging.api.GithubService.Companion Companion = null;
    
    /**
     * * Get repos ordered by stars.
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories?sort=stars")
    public abstract retrofit2.Call<com.example.android.codelabs.paging.api.RepoSearchResponse> searchRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int itemsPerPage);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/codelabs/paging/api/GithubService$Companion;", "", "()V", "BASE_URL", "", "create", "Lcom/example/android/codelabs/paging/api/GithubService;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://api.github.com/";
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.codelabs.paging.api.GithubService create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}