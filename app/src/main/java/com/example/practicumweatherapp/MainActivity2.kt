package com.example.practicumweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editTextUserInput = findViewById<EditText>(R.id.editTextText)
        val buttonCalculate = findViewById<Button>(R.id.button3)
        val textViewResult = findViewById<TextView>(R.id.textView5)
        val buttonClear = findViewById<Button>(R.id.button6)
        val buttonExitApp = findViewById<Button>(R.id.button5)
        val buttonDetailedView = findViewById<Button>(R.id.button4)
        val averageTemp: Double = 0.0
        var totalTemp: Double = 0.0
        val weekdays =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val temperatures = DoubleArray(7)
        var count = 0

        buttonDetailedView.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            buttonExitApp.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                for (count in 0..6) {
                println("${count + 1} - Enter weekday name:")
                    weekdays[count] = readLine()!!
                    println("Enter temperature for ${weekdays[count]}:")
                    temperatures[count] = readLine()!!.toDouble()





                }



            }
        }
    }
}