package com.example.android.codelabs.paging;

import java.lang.System;

/**
 * * Class that handles object creation.
 * * Like this, objects can be passed as parameters in the constructors and then replaced for
 * * testing, where needed.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/codelabs/paging/Injection;", "", "()V", "provideCache", "Lcom/example/android/codelabs/paging/db/GithubLocalCache;", "context", "Landroid/content/Context;", "provideGithubRepository", "Lcom/example/android/codelabs/paging/data/GithubRepository;", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
public final class Injection {
    public static final com.example.android.codelabs.paging.Injection INSTANCE = null;
    
    /**
     * * Creates an instance of [GithubLocalCache] based on the database DAO.
     */
    private final com.example.android.codelabs.paging.db.GithubLocalCache provideCache(android.content.Context context) {
        return null;
    }
    
    /**
     * * Creates an instance of [GithubRepository] based on the [GithubService] and a
     *     * [GithubLocalCache]
     */
    private final com.example.android.codelabs.paging.data.GithubRepository provideGithubRepository(android.content.Context context) {
        return null;
    }
    
    /**
     * * Provides the [ViewModelProvider.Factory] that is then used to get a reference to
     *     * [ViewModel] objects.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private Injection() {
        super();
    }
}