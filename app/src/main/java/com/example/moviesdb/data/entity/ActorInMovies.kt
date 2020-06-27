package com.example.moviesdb.data.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ActorInMovies(

    @Embedded
    val actor: Actor,

    @Relation(
        parentColumn = "actor_id",
        entityColumn = "movie_id",
        associateBy = Junction(MovieActor::class)
    )
    val movies: List<Movie>
)