package com.example.mad_practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.resultText)
        val randomInt = (1..6).random()
        //resultText.text = "Dice Rolled"
        resultText.text = randomInt.toString()


        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()


    }
}
