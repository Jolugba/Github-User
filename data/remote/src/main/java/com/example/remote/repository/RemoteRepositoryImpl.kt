package com.example.remote.repository

import com.example.common.networkThreadWithMainThread
import com.example.remote.api.GithubUsersApi
import com.example.remote.model.UserApiResponse
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val api: GithubUsersApi
) : RemoteRepository {
    override fun getUsers(): Single<UserApiResponse> {
        return api.getAllUsers("Lagos","1")
            .networkThreadWithMainThread()
    }
}
