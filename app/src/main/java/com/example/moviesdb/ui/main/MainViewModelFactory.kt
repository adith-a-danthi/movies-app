package com.example.moviesdb.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moviesdb.data.DataRepository
import kotlin.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val repository: DataRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(repository) as T
        } else {
            throw IllegalArgumentException("MainViewModel not found")
        }
    }
}