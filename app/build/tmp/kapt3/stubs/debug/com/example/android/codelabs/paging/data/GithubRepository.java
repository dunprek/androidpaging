package com.example.android.codelabs.paging.data;

import java.lang.System;

/**
 * * Repository class that works with local and remote data sources.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/android/codelabs/paging/data/GithubRepository;", "", "service", "Lcom/example/android/codelabs/paging/api/GithubService;", "cache", "Lcom/example/android/codelabs/paging/db/GithubLocalCache;", "(Lcom/example/android/codelabs/paging/api/GithubService;Lcom/example/android/codelabs/paging/db/GithubLocalCache;)V", "search", "Lcom/example/android/codelabs/paging/model/RepoSearchResult;", "query", "", "Companion", "app_debug"})
public final class GithubRepository {
    private final com.example.android.codelabs.paging.api.GithubService service = null;
    private final com.example.android.codelabs.paging.db.GithubLocalCache cache = null;
    private static final int DATABASE_PAGE_SIZE = 20;
    public static final com.example.android.codelabs.paging.data.GithubRepository.Companion Companion = null;
    
    /**
     * * Search repositories whose names match the query.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.codelabs.paging.model.RepoSearchResult search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public GithubRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.api.GithubService service, @org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.db.GithubLocalCache cache) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/codelabs/paging/data/GithubRepository$Companion;", "", "()V", "DATABASE_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}