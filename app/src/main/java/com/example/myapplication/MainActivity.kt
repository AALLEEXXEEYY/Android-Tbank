package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy { JokesAdapter() }
    val jokesList = listOf(
        Joke("Joke #1", "What does Santa suffer from if he gets stuck in a chimney?", "Claustrophobia!"),
        Joke("Joke #2", "Why did the chicken join a band?", "Because it had the drumsticks!"),
        Joke("Joke #3", "Why was the math book sad?", "Because it had too many problems."),
        Joke("Joke #4", "What do you call fake spaghetti?", "An impasta!"),
        Joke("Joke #5", "What kind of dog does Dracula have?", "A bloodhound!"),
        Joke("Joke #6", "What’s a tornado’s favorite game?", "Twister!"),
        Joke("Joke #7", "Why did the sun go to school?", "To get brighter!")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecycler()
    }

    private fun setUpRecycler() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        adapter.setData(jokesList)
    }
}