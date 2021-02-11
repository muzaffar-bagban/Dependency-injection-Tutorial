package com.muzaffar.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/muzaffar/domain/usecases/UserListUseCase;", "Lcom/muzaffar/domain/base/UseCase;", "Lcom/muzaffar/domain/utils/Resource;", "", "Lcom/muzaffar/domain/User;", "usersListGateway", "Lcom/muzaffar/domain/gateways/UsersListGateway;", "(Lcom/muzaffar/domain/gateways/UsersListGateway;)V", "getUsers", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeApiCall", "domain"})
public final class UserListUseCase extends com.muzaffar.domain.base.UseCase<com.muzaffar.domain.utils.Resource<? extends java.util.List<? extends com.muzaffar.domain.User>>> {
    private final com.muzaffar.domain.gateways.UsersListGateway usersListGateway = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.muzaffar.domain.utils.Resource<? extends java.util.List<com.muzaffar.domain.User>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object makeApiCall(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.muzaffar.domain.utils.Resource<? extends java.util.List<com.muzaffar.domain.User>>>> p0) {
        return null;
    }
    
    public UserListUseCase(@org.jetbrains.annotations.NotNull()
    com.muzaffar.domain.gateways.UsersListGateway usersListGateway) {
        super();
    }
}