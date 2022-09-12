package com.yuntai.info.moudle

import com.yuntai.domain.repository.MainRepository
import com.yuntai.data.repositoryImpl.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoriesModule {
    @Binds
    fun mainRepository(mainRepositoryImpl: MainRepositoryImpl) : MainRepository
}