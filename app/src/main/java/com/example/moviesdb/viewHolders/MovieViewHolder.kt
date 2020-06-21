package com.example.moviesdb.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.example.moviesdb.data.entity.Movie
import com.example.moviesdb.databinding.MovieItemBinding

class MovieViewHolder(private val binding: MovieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie){
        binding.movieNameTv.text = movie.movieName
    }
}