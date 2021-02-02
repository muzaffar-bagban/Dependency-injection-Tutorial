package com.muzaffar.dagger_hilt_tutorial.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muzaffar.dagger_hilt_tutorial.data.model.User
import com.muzaffar.dagger_hilt_tutorial.data.repository.MainRepository
import com.muzaffar.dagger_hilt_tutorial.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
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
            mainRepository.getUsers().let {
                if (it.isSuccessful) {
                    _users.postValue(Resource.success(it.body()))
                } else _users.postValue(Resource.error(it.errorBody().toString(), null))
            }
        }
    }
}