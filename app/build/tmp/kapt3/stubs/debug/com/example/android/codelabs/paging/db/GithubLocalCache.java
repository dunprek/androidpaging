package com.example.android.codelabs.paging.db;

import java.lang.System;

/**
 * * Class that handles the DAO local data source. This ensures that methods are triggered on the
 * * correct executor.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/codelabs/paging/db/GithubLocalCache;", "", "repoDao", "Lcom/example/android/codelabs/paging/db/RepoDao;", "ioExecutor", "Ljava/util/concurrent/Executor;", "(Lcom/example/android/codelabs/paging/db/RepoDao;Ljava/util/concurrent/Executor;)V", "insert", "", "repos", "", "Lcom/example/android/codelabs/paging/model/Repo;", "insertFinished", "Lkotlin/Function0;", "reposByName", "Landroidx/paging/DataSource$Factory;", "", "name", "", "app_debug"})
public final class GithubLocalCache {
    private final com.example.android.codelabs.paging.db.RepoDao repoDao = null;
    private final java.util.concurrent.Executor ioExecutor = null;
    
    /**
     * * Insert a list of repos in the database, on a background thread.
     */
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.codelabs.paging.model.Repo> repos, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> insertFinished) {
    }
    
    /**
     * * Request a LiveData<List<Repo>> from the Dao, based on a repo name. If the name contains
     *     * multiple words separated by spaces, then we're emulating the GitHub API behavior and allow
     *     * any characters between the words.
     *     * @param name repository name
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.example.android.codelabs.paging.model.Repo> reposByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public GithubLocalCache(@org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.db.RepoDao repoDao, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor ioExecutor) {
        super();
    }
}