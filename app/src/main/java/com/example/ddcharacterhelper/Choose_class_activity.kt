package com.example.ddcharacterhelper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Choose_class_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_class_activity)


        val startButton = findViewById<Button>(R.id.confirm_button)
        startButton.setOnClickListener {
            val intent = Intent(this@Choose_class_activity, StatChooserActivity::class.java)
            startActivity(intent)
        }
    }
}
