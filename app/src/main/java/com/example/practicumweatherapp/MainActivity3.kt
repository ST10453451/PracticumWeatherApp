package com.example.practicumweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val buttonMainScreen2 = findViewById<Button>(R.id.button7)
        val buttonExitApp2 = findViewById<Button>(R.id.button8)

        buttonMainScreen2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            buttonMainScreen2.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                println()
            }
        }
    }
}