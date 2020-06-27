package com.example.moviesdb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.moviesdb.data.entity.Users

@Dao
interface UserDao {

    @Insert
    fun insert(vararg users: Users)

}