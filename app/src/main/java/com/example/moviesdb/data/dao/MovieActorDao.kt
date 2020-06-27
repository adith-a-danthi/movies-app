package com.example.moviesdb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.moviesdb.data.entity.MovieActor

@Dao
interface MovieActorDao {

    @Insert
    fun insert(vararg movieActor: MovieActor)

}