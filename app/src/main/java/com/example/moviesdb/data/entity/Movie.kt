package com.example.moviesdb.data.entity

import androidx.room.*
import com.example.moviesdb.data.entity.convertor.ListToString

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "movie_id")
    var movieID: Long,

    @ColumnInfo(name = "movie_name")
    var movieName: String,

    @ColumnInfo(name = "movie_poster")
    var moviePoster: String,

    @TypeConverters(ListToString::class)
    @ColumnInfo(name = "genres")
    var genres: List<String>
)


