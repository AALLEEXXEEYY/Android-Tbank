package com.example.myapplication

object JokesData {
    fun getJokesList(): List<Joke> {
        val jokesList = listOf(
            Joke("Joke #1", "What does Santa suffer from if he gets stuck in a chimney?", "Claustrophobia!"),
            Joke("Joke #2", "Why did the chicken join a band?", "Because it had the drumsticks!"),
            Joke("Joke #3", "Why was the math book sad?", "Because it had too many problems."),
            Joke("Joke #4", "What do you call fake spaghetti?", "An impasta!"),
            Joke("Joke #5", "What kind of dog does Dracula have?", "A bloodhound!"),
            Joke("Joke #6", "What’s a tornado’s favorite game?", "Twister!"),
            Joke("Joke #7", "Why did the sun go to school?", "To get brighter!")
        )
        return jokesList
    }
}