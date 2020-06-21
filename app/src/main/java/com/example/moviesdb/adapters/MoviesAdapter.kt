package com.example.moviesdb.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesdb.data.entity.Movie
import com.example.moviesdb.databinding.MovieItemBinding
import com.example.moviesdb.viewHolders.MovieViewHolder

class MoviesAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    var movies: List<Movie> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = MovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        with(movies[position]){
            holder.bind(this)
        }
    }

    override fun getItemCount() = movies.size
}