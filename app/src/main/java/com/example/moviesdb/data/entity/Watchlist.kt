package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "watchlists")
data class Watchlist(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "watchlist_id")
    val watchlistId: Long,

    @ColumnInfo(name = "watchlist_name")
    val watchlistName: String,

    @ColumnInfo(name = "created_by_user")
    val createdByUser: Long

)