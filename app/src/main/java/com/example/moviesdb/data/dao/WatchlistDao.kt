package com.example.moviesdb.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.moviesdb.data.entity.Watchlist

@Dao
interface WatchlistDao {

    @Insert
    fun insert(vararg watchlist: Watchlist)

    @Update
    fun update(vararg watchlist: Watchlist)

    @Delete
    fun delete(vararg watchlist: Watchlist)

}