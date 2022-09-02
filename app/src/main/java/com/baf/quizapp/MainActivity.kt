package com.baf.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById<Button>(R.id.btn_start)
        val etName :EditText = findViewById<EditText>(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
               Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {

               val intent = Intent(this , QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME , etName.text.toString())
                startActivity(intent)
                finish()
            }
        }




    }
}