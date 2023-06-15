package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ChooseRaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_race_activity)


        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_race, InfoButtonFragment.newInstance("#toc1"))
                .commit()
        }


        val confirmButton = findViewById<Button>(R.id.confirm_button)
        val racesBox = findViewById<Spinner>(R.id.spinner_race)
        confirmButton.setOnClickListener {
            val intent = Intent(this@ChooseRaceActivity, ResultsActivity::class.java)
            Character.race = racesBox.selectedItem.toString()
            startActivity(intent)
        }
    }
}