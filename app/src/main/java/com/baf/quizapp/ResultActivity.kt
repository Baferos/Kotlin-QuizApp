package com.baf.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private var tvName : TextView? = null
    private var tvScore : TextView? = null
    private var btnFinish : Button? = null
    private var totalQuestions : Int = 0
    private var correctAnswers : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvName = findViewById(R.id.tv_name)
        tvScore = findViewById(R.id.tv_score)
        btnFinish = findViewById(R.id.btn_finish)

        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore?.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnFinish?.setOnClickListener {
            startAgain()
        }
    }

    private fun startAgain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}