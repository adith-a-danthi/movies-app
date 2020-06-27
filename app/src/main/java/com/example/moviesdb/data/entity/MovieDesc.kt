package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Movie Description made a separate entity only to demonstrate 1:1 relation

@Entity(tableName = "movie_desc")
data class MovieDesc(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "desc_id")
    val descID: Long,

    @ColumnInfo(name = "movie")
    val movieID: Long,

    @ColumnInfo(name = "description")
    val description: String
)