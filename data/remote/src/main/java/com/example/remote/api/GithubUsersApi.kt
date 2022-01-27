package com.example.remote.api

import com.example.remote.model.UserApiResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubUsersApi {
    @GET("search/users")
    fun getAllUsers(
        @Query("q") location: String,
        @Query("page") page: String
    ): Single<UserApiResponse>

}
