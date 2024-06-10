package com.example.practicumweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMainScreen = findViewById<Button>(R.id.button)
        val buttonExit1 = findViewById<Button>(R.id.button)

        buttonMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            buttonExit1.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}
