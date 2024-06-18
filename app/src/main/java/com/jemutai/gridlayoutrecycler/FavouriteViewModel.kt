package com.jemutai.gridlayoutrecycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavouritesViewModel : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> get() = _movies

    init {
        loadMovies()
    }

    private fun loadMovies() {
        // Replace with your actual data loading logic
        val dummyMovies = listOf(
            Movie(1, "Movie Title 1", "https://example.com/image1.jpg"),
            Movie(2, "Movie Title 2", "https://example.com/image2.jpg")
        )
        _movies.postValue(dummyMovies)
    }
}
