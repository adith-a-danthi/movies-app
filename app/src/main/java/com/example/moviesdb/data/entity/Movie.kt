package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "movie_id")
    var movieID: Long,

    @ColumnInfo(name = "movie_name")
    var movieName: String,

    @ColumnInfo(name = "movie_poster")
    var moviePoster: String
)


