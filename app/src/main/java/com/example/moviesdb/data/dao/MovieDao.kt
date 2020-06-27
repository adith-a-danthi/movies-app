package com.example.moviesdb.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.moviesdb.data.entity.Movie
import com.example.moviesdb.data.entity.MovieWithDescription

@Dao
interface MovieDao {

    @Insert
    fun insert(vararg movie: Movie)

    @Update
    fun update(vararg movie:Movie)

    @Query("SELECT * FROM movies WHERE movie_id =:movieId")
    fun getMovie(vararg movieId: Long): LiveData<Movie>

    @Query("SELECT * FROM movies")
    fun getAllMovies(): LiveData<List<Movie>>

    @Transaction
    @Query("SELECT * FROM movies WHERE movie_id = :movieId")
    fun getMovieWithDescription(movieId: Long): LiveData<MovieWithDescription>

}