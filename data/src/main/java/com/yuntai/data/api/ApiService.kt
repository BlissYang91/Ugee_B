package com.yuntai.data.api

import com.yuntai.domain.entity.Movie
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("movielist.json")
    suspend fun getAllMovies() : Response<List<Movie>>
}