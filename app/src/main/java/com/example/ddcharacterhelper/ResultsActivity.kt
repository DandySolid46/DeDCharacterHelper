package com.example.ddcharacterhelper

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_activity)

        val resultsTextview = findViewById<TextView>(R.id.result_text)
        val resultsText = "Race: ${Character.race} Class: ${Character.dEdClass}\n" +
                "Charisma: ${Character.charisma}\n" +
                "Constitution: ${Character.constitution}\n" +
                "Dexterity: ${Character.dexterity}\n" +
                "Intelligence: ${Character.intelligence}\n" +
                "Strength: ${Character.strength}\n" +
                "Wisdom: ${Character.wisdom}\n"

        resultsTextview.text = resultsText
        val mailButton = findViewById<ImageButton>(R.id.mail_button)
        mailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_TEXT, resultsText)
            startActivity(intent)
        }


        val confirmButton = findViewById<Button>(R.id.restart_button)
        confirmButton.setOnClickListener {
            val intent = Intent(this@ResultsActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}