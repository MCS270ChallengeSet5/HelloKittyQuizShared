package com.example.hellokittyquiz

import Question
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel(){

    // Initializing index counter
    var index = 0
    // Load questions by creating a list of Question objects
    val questionBank = listOf(
        Question(R.string.kitty1, true),
        Question(R.string.kitty2, false),
        Question(R.string.kitty3, false),
        Question(R.string.kitty4, true)
    )

    val currentQuestionText: Int
        get() = questionBank[index].textReId

    fun moveToNext(){
        index = (index+1)%questionBank.size
    }
    fun moveToPrevious(){
        index--
        if(index == -1){
            index = questionBank.size - 1
        }
    }
}