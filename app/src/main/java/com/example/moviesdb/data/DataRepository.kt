package com.example.moviesdb.data

import android.content.Context
import android.provider.ContactsContract
import com.example.moviesdb.data.entity.Actor
import com.example.moviesdb.data.entity.Movie
import com.example.moviesdb.util.runInBackground

class DataRepository private constructor(context: Context){

    private val movieDB = MovieDB.getInstance(context)
    private val movieDao = movieDB.movieDao()
    private val actorDao = movieDB.actorDao()

    companion object {
        fun getInstance(context: Context): DataRepository {
            return DataRepository(context)
        }
    }

    fun newMovie(movie: Movie){
        runInBackground {
            movieDao.insert(movie)
        }
    }

    fun newActor(actor: Actor){
        runInBackground {
            actorDao.insert(actor)
        }
    }
}