package com.example.features.ui.users

import androidx.annotation.StringRes
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.usecase.UseCase
import com.example.features.R
import com.example.remote.model.Item
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val userUseCase: UseCase
) : ViewModel() {

    val userState = MutableLiveData<State?>(null)

    init {
        getUsers()
        Timber.e("bbbb${getUsers()}")
    }

    private fun getUsers() {
        userUseCase.execute()
            .subscribe { response, error ->
                if (error != null) {
                    userState.postValue(State.ErrorMessage(R.string.network_error))
                } else {
                    userState.postValue(State.Data(response.items))
                }
            }

    }

    sealed class State {
        data class ErrorMessage(@StringRes val msg: Int) : State()
        data class Data(val userData: List<Item>) : State()
        data class Loading(val isLoading: Boolean = false) : State()
    }


}
