package com.example.moviesdb.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.moviesdb.data.entity.Actor
import com.example.moviesdb.data.entity.ActorInMovies

interface ActorDao {

    @Insert
    fun insert(vararg actor: Actor)

    @Update
    fun update(vararg actor: Actor)

    @Query("SELECT * FROM actors WHERE actor_id =:actorId")
    fun getActor(vararg actorId:Long)

    @Query("SELECT * FROM movies")
    fun getAllMovies(): LiveData<List<Actor>>

    @Transaction
    @Query("SELECT * FROM actors WHERE actor_id = :actorId")
    fun getActorWithMovies(actorId: Long): LiveData<ActorInMovies>

}