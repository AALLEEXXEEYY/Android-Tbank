package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class JokeAdapter(private val jokes: List<Joke>) : RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    inner class JokeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryTextView: TextView = itemView.findViewById(R.id.categoryTextView)
        private val questionTextView: TextView = itemView.findViewById(R.id.questionTextView)
        private val answerTextView: TextView = itemView.findViewById(R.id.answerTextView)

        fun bind(joke: Joke) {
            categoryTextView.text = joke.category
            questionTextView.text = joke.question
            answerTextView.text = if (joke.answer.length > 40) {
                "${joke.answer.take(40)}..."
            } else {
                joke.answer
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_joke, parent, false)
        return JokeViewHolder(view)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind(jokes[position])
    }

    override fun getItemCount() = jokes.size
}
