package com.muzaffar.data.userList

import com.muzaffar.data.retrofit.UserListRepository
import com.muzaffar.domain.User
import com.muzaffar.domain.gateways.UsersListGateway
import com.muzaffar.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

private const val TAG = "223344"

class UserListGatewayImpl(
    private val userListRepository: UserListRepository
): UsersListGateway {
    override suspend fun getUsers(): Flow<Resource<List<User>>>  {
        return flow {
            userListRepository.userListService.getUsers().let {
                if (it.isSuccessful) {
                    emit(Resource.success(it.body()))
                } else {
                    emit(Resource.error("Failed to get users", null))
                }
            }
        }
    }
}