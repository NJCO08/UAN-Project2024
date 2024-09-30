package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class PartsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parts)

        val btnBicycles = findViewById<Button>(R.id.buttonBicycles)
        val btnAccessories = findViewById<Button>(R.id.buttonAccessories)

        btnBicycles.setOnClickListener {
            val intent = Intent(this, BicyclesActivity::class.java)
            startActivity(intent)
        }

        btnAccessories.setOnClickListener {
            val intent = Intent(this, AccessoriesActivity::class.java)
            startActivity(intent)
        }
    }
}






