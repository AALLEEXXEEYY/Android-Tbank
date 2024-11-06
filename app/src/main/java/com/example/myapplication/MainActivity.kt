package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jokes = listOf(
            Joke("Holiday", "What does Santa suffer from if he gets stuck in a chimney?", "Claustrophobia!"),
            Joke("Animals", "Why did the chicken join a band?", "Because it had the drumsticks!"),
            Joke("School", "Why was the math book sad?", "Because it had too many problems."),
            Joke("Food", "What do you call fake spaghetti?", "An impasta!"),
            Joke("Science", "What kind of dog does Dracula have?", "A bloodhound!"),
            Joke("Weather", "What’s a tornado’s favorite game?", "Twister!"),
            Joke("Space", "Why did the sun go to school?", "To get brighter!")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = JokeAdapter(jokes)
    }
}
