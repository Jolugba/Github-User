package com.example.domain.usecase

import com.example.remote.model.UserApiResponse
import com.example.remote.repository.RemoteRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class UseCase @Inject constructor(
    private val usersRepository: RemoteRepository
) {
    fun execute(): Single<UserApiResponse> {
        return usersRepository.getUsers()
    }

}
