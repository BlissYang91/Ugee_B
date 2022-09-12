package com.yuntai.domain.common

interface UseCase <in P, out R> {
    suspend fun execute(params: P, callback: Callback<R>)
}