package com.example.remote.repository

import com.example.remote.model.UserApiResponse
import io.reactivex.rxjava3.core.Single


interface RemoteRepository {
    fun getUsers(): Single<UserApiResponse>
}
