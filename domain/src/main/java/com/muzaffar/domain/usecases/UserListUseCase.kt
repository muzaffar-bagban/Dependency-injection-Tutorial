package com.muzaffar.domain.usecases

import com.muzaffar.domain.User
import com.muzaffar.domain.base.UseCase
import com.muzaffar.domain.gateways.UsersListGateway
import com.muzaffar.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

class UserListUseCase (
    private val usersListGateway: UsersListGateway
): UseCase<Resource<List<User>>>() {

    suspend fun getUsers() = execute()
    override suspend fun makeApiCall(): Flow<Resource<List<User>>> = usersListGateway.getUsers()
}