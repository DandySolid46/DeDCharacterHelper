package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_activity)


        val confirmButton = findViewById<Button>(R.id.button)
        confirmButton.setOnClickListener {
            val intent = Intent(this@ResultsActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}