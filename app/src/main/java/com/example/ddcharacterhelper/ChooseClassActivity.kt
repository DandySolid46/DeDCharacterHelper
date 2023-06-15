package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ChooseClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_class_activity)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_class, InfoButtonFragment.newInstance("#toc19"))
                .commit()
        }

        val startButton = findViewById<Button>(R.id.confirm_button)
        val classesBox = findViewById<Spinner>(R.id.spinner_race)
        startButton.setOnClickListener {
            val intent = Intent(this@ChooseClassActivity, StatChooserActivity::class.java)

            Character.dEdClass = classesBox.selectedItem.toString()
            startActivity(intent)
        }
    }
}
