package com.jemutai.gridlayoutrecycler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.jemutai.gridlayoutrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.adapter = MovieAdapter(getSampleMovies()) // Replace with your actual list of movies
    }

    private fun getSampleMovies(): List<Movie> {
        return listOf(
            Movie(1, "Movie 1", "https://example.com/movie1.jpg"),
            Movie(2, "Movie 2", "https://example.com/movie2.jpg"),
            Movie(3, "Movie 3", "https://example.com/movie3.jpg"),
            Movie(4, "Movie 4", "https://example.com/movie4.jpg"),
            Movie(5, "Movie 5", "https://example.com/movie5.jpg"),
            Movie(6, "Movie 5", "https://example.com/movie6.jpg"),
            Movie(7, "Movie 5", "https://example.com/movie7.jpg"),
            Movie(8, "Movie 5", "https://example.com/movie8.jpg"),
            Movie(9, "Movie 5", "https://example.com/movie9.jpg")





        )
    }
}

