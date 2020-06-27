package com.example.moviesdb.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val userID: Long,

    @ColumnInfo(name = "user_name")
    val userName: String

)