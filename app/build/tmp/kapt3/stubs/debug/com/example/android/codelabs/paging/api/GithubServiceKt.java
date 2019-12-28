package com.example.android.codelabs.paging.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ar\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\'\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\f2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"IN_QUALIFIER", "", "TAG", "searchRepos", "", "service", "Lcom/example/android/codelabs/paging/api/GithubService;", "query", "page", "", "itemsPerPage", "onSuccess", "Lkotlin/Function1;", "", "Lcom/example/android/codelabs/paging/model/Repo;", "Lkotlin/ParameterName;", "name", "repos", "onError", "error", "app_debug"})
public final class GithubServiceKt {
    private static final java.lang.String TAG = "GithubService";
    private static final java.lang.String IN_QUALIFIER = "in:name,description";
    
    /**
     * * Search repos based on a query.
     * * Trigger a request to the Github searchRepo API with the following params:
     * * @param query searchRepo keyword
     * * @param page request page index
     * * @param itemsPerPage number of repositories to be returned by the Github API per page
     * *
     * * The result of the request is handled by the implementation of the functions passed as params
     * * @param onSuccess function that defines how to handle the list of repos received
     * * @param onError function that defines how to handle request failure
     */
    public static final void searchRepos(@org.jetbrains.annotations.NotNull()
    com.example.android.codelabs.paging.api.GithubService service, @org.jetbrains.annotations.NotNull()
    java.lang.String query, int page, int itemsPerPage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.android.codelabs.paging.model.Repo>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
}