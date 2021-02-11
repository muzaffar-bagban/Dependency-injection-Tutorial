package com.muzaffar.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserListRepository {

    companion object {
        const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"
    }

    val userListService: UserListService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserListService::class.java)
    }

}