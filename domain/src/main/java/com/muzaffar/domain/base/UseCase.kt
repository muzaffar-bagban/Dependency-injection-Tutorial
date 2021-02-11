package com.muzaffar.domain.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

abstract class UseCase<T> {

    abstract suspend fun makeApiCall(): Flow<T>
    suspend fun execute(): Flow<T> = makeApiCall().flowOn(Dispatchers.IO)
}