package com.example.moviesdb.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.moviesdb.data.dao.ActorDao
import com.example.moviesdb.data.dao.MovieDao
import com.example.moviesdb.data.entity.Actor
import com.example.moviesdb.data.entity.Movie
import com.example.moviesdb.data.entity.MovieActor
import com.example.moviesdb.data.entity.MovieDesc

@Database(
    entities = [
        Movie::class,
        MovieDesc::class,
        Actor::class,
        MovieActor::class
    ], version = 1, exportSchema = false
)
abstract class MovieDB: RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun actorDao():ActorDao

    companion object {

        @Volatile
        private var movieDB: MovieDB? = null

        fun getInstance(appContext: Context): MovieDB {
            if (movieDB != null){
                synchronized(this){
                    if (movieDB != null){
                        movieDB = Room.databaseBuilder(
                            appContext,
                            MovieDB::class.java,
                            "movie_database"
                        ).fallbackToDestructiveMigration()
                            .build()
                    }
                }
            }
            return movieDB!!
        }

    }
}