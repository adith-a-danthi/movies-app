package com.example.moviesdb.data.entity

import androidx.room.Embedded
import androidx.room.Relation

// Movie Description made a separate entity only to demonstrate 1:1 relation

data class MovieWithDescription(

    @Embedded
    val movie: Movie,

    @Relation(
        parentColumn = "movie_id",
        entityColumn = "movie"
    )
    val movieDesc: MovieDesc

)