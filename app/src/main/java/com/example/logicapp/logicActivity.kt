package com.example.logicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class logicActivity : AppCompatActivity() {
    val answerFirstField = "T"
    val answerSecondField = "F"
    val answerThirdField = "F"
    val answerFourthField = "F"
    var correctNumOfAnswers = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener { checkAns() }
    }
    private fun checkAns(){
        if (enter1.text.toString() == answerFirstField){
            correctNumOfAnswers += 1
        }else{
            correctNumOfAnswers = correctNumOfAnswers
        }

        if (enter2.text.toString() == answerSecondField){
            correctNumOfAnswers += 1
        }else{
            correctNumOfAnswers = correctNumOfAnswers
        }

        if (enter3.text.toString() == answerThirdField){
            correctNumOfAnswers += 1
        }else{
            correctNumOfAnswers = correctNumOfAnswers
        }

        if (enter4.text.toString() == answerFourthField){
            correctNumOfAnswers += 1
        }else{
            correctNumOfAnswers = correctNumOfAnswers
        }

        Toast.makeText(this, getString(R.string.toast, correctNumOfAnswers), Toast.LENGTH_SHORT).show()
        correctNumOfAnswers = 0
    }
}
