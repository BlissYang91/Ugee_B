package com.yuntai.data.repositoryImpl

import com.yuntai.data.api.ApiService
import com.yuntai.domain.entity.Movie
import com.yuntai.domain.repository.MainRepository
import retrofit2.Response
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(private val apiService: ApiService) : MainRepository {
    override suspend fun getAllMovies(): Response<List<Movie>> = apiService.getAllMovies()
}