package com.example.moviesdb.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.moviesdb.data.DataRepository
import com.example.moviesdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = DataRepository.getInstance(this)
        mainViewModel = ViewModelProvider(
            this,
            MainViewModelFactory(repository)
        ).get(MainViewModel::class.java)
    }
}