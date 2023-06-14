package com.example.ddcharacterhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InfoButtonFragment.newInstance(""))
                .commit()
        }
        val startButton = findViewById<Button>(R.id.star_button)
        startButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ChooseClassActivity::class.java)
            startActivity(intent)
        }
    }


}