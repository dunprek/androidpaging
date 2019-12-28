package com.example.android.codelabs.paging.db;

import java.lang.System;

/**
 * * Room data access object for accessing the [Repo] table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/android/codelabs/paging/db/RepoDao;", "", "insert", "", "posts", "", "Lcom/example/android/codelabs/paging/model/Repo;", "reposByName", "Landroidx/paging/DataSource$Factory;", "", "queryString", "", "app_debug"})
public abstract interface RepoDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.codelabs.paging.model.Repo> posts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM repos WHERE (name LIKE :queryString) OR (description LIKE :queryString) ORDER BY stars DESC, name ASC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.example.android.codelabs.paging.model.Repo> reposByName(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString);
}