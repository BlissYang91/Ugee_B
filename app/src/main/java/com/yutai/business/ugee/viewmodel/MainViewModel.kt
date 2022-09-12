package com.yuntai.info.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.yuntai.domain.viewmodel.BaseViewModel
import com.yuntai.domain.entity.Movie
import com.yuntai.domain.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : BaseViewModel() {
    private val movieList = MutableLiveData<List<Movie>>()

    fun fetchAllMovies(){
        getProgressBarStatus().value = true
        viewModelScope.launch {
            val response = mainRepository.getAllMovies()
            if (response.isSuccessful) {
                movieList.postValue(response.body())
                getProgressBarStatus().value = false
            }
        }

    }
    fun getMovieList() : MutableLiveData<List<Movie>> {
        return movieList
    }
}