package com.muzaffar.domain.gateways

import com.muzaffar.domain.User
import com.muzaffar.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface UsersListGateway {
    suspend fun getUsers(): Flow<Resource<List<User>>>
}