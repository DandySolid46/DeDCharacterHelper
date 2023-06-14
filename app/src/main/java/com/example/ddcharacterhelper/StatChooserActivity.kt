package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StatChooserActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stat_chooser_activity)


        val confirmButton = findViewById<Button>(R.id.continue_button)
        confirmButton.setOnClickListener {
            val intent = Intent(this@StatChooserActivity, ChooseRaceActivity::class.java)
            startActivity(intent)
        }
    }
}