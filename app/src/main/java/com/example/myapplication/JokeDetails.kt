package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityJokeDetailsBinding
import com.example.myapplication.databinding.ItemJokeBinding

class JokeDetails : AppCompatActivity() {

    private val jokesData by lazy {JokesData}
    private lateinit var binding: ActivityJokeDetailsBinding
    private var jokesList = jokesData.getJokesList()
    private val jokeIndex = "jokeIndex"

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityJokeDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        with(binding) {
            kapibara.setImageResource(R.drawable.kapibara)
            header.text = jokesList[intent.getIntExtra(jokeIndex, 0)].category
            question.text = jokesList[intent.getIntExtra(jokeIndex, 0)].question
            answer.text = jokesList[intent.getIntExtra(jokeIndex, 0)].answer
        }
    }
}