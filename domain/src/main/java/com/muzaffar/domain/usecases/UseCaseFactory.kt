package com.muzaffar.domain.usecases

class UseCaseFactory (
    private val userListUseCase: UserListUseCase
) {
    suspend fun getUserList() = userListUseCase.getUsers()
}