package com.muzaffar.dagger_hilt_tutorial.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muzaffar.domain.User
import com.muzaffar.domain.usecases.UseCaseFactory
import com.muzaffar.domain.utils.Resource
import com.muzaffar.domain.utils.Status
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class MainViewModel @ViewModelInject constructor(
    private val useCaseFactory: UseCaseFactory
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            useCaseFactory.getUserList().let { responseFlow ->
                responseFlow.collect { responseResource ->
                    when(responseResource.status) {
                        Status.SUCCESS -> {_users.postValue(Resource.success(responseResource.data))}
                        Status.LOADING -> {_users.postValue(Resource.loading(null))}
                        Status.ERROR -> {_users.postValue(Resource.error(responseResource.message!!, null))}
                    }
                }
            }
        }
    }
}