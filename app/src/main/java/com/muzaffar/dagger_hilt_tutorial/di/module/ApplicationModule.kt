package com.muzaffar.dagger_hilt_tutorial.di.module

import com.muzaffar.data.retrofit.UserListRepository
import com.muzaffar.data.userList.UserListGatewayImpl
import com.muzaffar.domain.gateways.UsersListGateway
import com.muzaffar.domain.usecases.UseCaseFactory
import com.muzaffar.domain.usecases.UserListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Provides
    @Singleton
    fun provideUserListRepository(): UserListRepository =
        UserListRepository()

    @Provides
    @Singleton
    fun provideUserListGatewayImpl(userListRepository: UserListRepository): UserListGatewayImpl =
        UserListGatewayImpl(userListRepository)

    @Provides
    @Singleton
    fun provideUserListGateway(userListGatewayImpl: UserListGatewayImpl): UsersListGateway =
        userListGatewayImpl

    @Provides
    @Singleton
    fun provideUserListUseCase(usersListGateway: UsersListGateway): UserListUseCase =
        UserListUseCase(usersListGateway)

    @Provides
    @Singleton
    fun provideUseCaseFactory(userListUseCase: UserListUseCase): UseCaseFactory =
        UseCaseFactory(userListUseCase)

}