package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "actors")
data class Actor(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "actor_id")
    var actorID: Long,
    
    @ColumnInfo(name = "actor_name")
    var actorName: String
) 