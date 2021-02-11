package com.muzaffar.data.retrofit

import retrofit2.Response
import retrofit2.http.GET
import com.muzaffar.domain.User

interface UserListService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}