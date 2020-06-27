package com.example.moviesdb.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.moviesdb.data.entity.UserWithWatchlist

@Dao
interface UserWithWatchlistDao {

    @Transaction
    @Query("SELECT * FROM users WHERE user_id = :userId")
    fun getUserWithWatchList(userId: Long): LiveData<List<UserWithWatchlist>>

}