package com.example.moviesdb.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithWatchlist(

    @Embedded
    val users: Users,

    @Relation(
        parentColumn = "user_id",
        entityColumn = "created_by"
    )
    val watchlists: List<Watchlist>

)