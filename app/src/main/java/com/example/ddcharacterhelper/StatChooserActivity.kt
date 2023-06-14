package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StatChooserActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stat_chooser_activity)

        val extras = intent.extras
        if (extras != null) {
            val chosenClass = extras.getString("classe")
            //The key argument here must match that used in the other activity
        }


        val confirmButton = findViewById<Button>(R.id.continue_button)
        val inteligenceSlot = findViewById<TextView>(R.id.inteligence_value)
        val wisdomSlot = findViewById<TextView>(R.id.wisdom_value)
        val strengthSlot = findViewById<TextView>(R.id.strength_value)
        val constitutionSlot = findViewById<TextView>(R.id.constitution_value)
        val charismaSlot = findViewById<TextView>(R.id.charism_value)
        val dexteritySlot = findViewById<TextView>(R.id.dexterity_value)

        confirmButton.setOnClickListener {
            val intent = Intent(this@StatChooserActivity, ChooseRaceActivity::class.java)
            Character.charisma = charismaSlot.text.toString().toInt()
            Character.constitution = constitutionSlot.text.toString().toInt()
            Character.dexterity = dexteritySlot.text.toString().toInt()
            Character.intelligence = inteligenceSlot.text.toString().toInt()
            Character.strength = strengthSlot.text.toString().toInt()

            startActivity(intent)
        }
    }
}