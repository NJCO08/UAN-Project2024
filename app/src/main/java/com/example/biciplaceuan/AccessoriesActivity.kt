package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class AccessoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessories)

        val btnBicycles = findViewById<Button>(R.id.buttonBicycles)
        val btnParts = findViewById<Button>(R.id.buttonParts)

        btnBicycles.setOnClickListener {
            val intent = Intent(this, BicyclesActivity::class.java)
            startActivity(intent)
        }

        btnParts.setOnClickListener {
            val intent = Intent(this, PartsActivity::class.java)
            startActivity(intent)
        }
    }
}


