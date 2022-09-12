package com.yuntai.domain.repository

import com.yuntai.domain.entity.Movie
import retrofit2.Response

interface MainRepository {
    suspend fun getAllMovies() : Response<List<Movie>>
}