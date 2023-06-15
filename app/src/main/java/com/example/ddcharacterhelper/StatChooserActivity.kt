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



        val confirmButton = findViewById<Button>(R.id.continue_button)
        val intelligenceSlot = findViewById<TextView>(R.id.inteligence_value)
        val wisdomSlot = findViewById<TextView>(R.id.wisdom_value)
        val strengthSlot = findViewById<TextView>(R.id.strength_value)
        val constitutionSlot = findViewById<TextView>(R.id.constitution_value)
        val charismaSlot = findViewById<TextView>(R.id.charism_value)
        val dexteritySlot = findViewById<TextView>(R.id.dexterity_value)

        confirmButton.setOnClickListener {
            val intent = Intent(this@StatChooserActivity, ChooseRaceActivity::class.java)
            Character.charisma = if(charismaSlot.text.toString() != "") { charismaSlot.text.toString().toInt() } else {0}
            Character.constitution = if(constitutionSlot.text.toString() != "") { constitutionSlot.text.toString().toInt() } else {0}
            Character.dexterity = if(dexteritySlot.text.toString() != "") { dexteritySlot.text.toString().toInt() } else {0}
            Character.intelligence = if(intelligenceSlot.text.toString() != "") { intelligenceSlot.text.toString().toInt() } else {0}
            Character.strength = if(strengthSlot.text.toString() != "") { strengthSlot.text.toString().toInt() } else {0}
            Character.wisdom = if(wisdomSlot.text.toString() != "") { wisdomSlot.text.toString().toInt() } else {0}

            startActivity(intent)
        }
    }
}