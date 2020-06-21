package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "actors")
data class Actor(
    @PrimaryKey (autoGenerate = true)
    var actorID: Long,
    
    @ColumnInfo(name = "actor_id")
    var actorName: String
) 