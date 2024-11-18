package com.example.myapplication

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemJokeBinding

class JokesHolder(private val binding: ItemJokeBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(joke: Joke) {
//        binding.imageView.setOnClickListener {
//            if (binding.answer.text == joke.answer)
//                binding.answer.text = ""
//            else {
//                binding.answer.text = joke.answer
//            }
//        }
        binding.header.text = joke.category
        binding.question.text = joke.question
    }
}