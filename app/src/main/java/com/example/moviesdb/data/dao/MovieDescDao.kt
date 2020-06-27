package com.example.moviesdb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.moviesdb.data.entity.MovieDesc

@Dao
interface MovieDescDao {

    @Insert
    fun insert(vararg movieDesc: MovieDesc)

}