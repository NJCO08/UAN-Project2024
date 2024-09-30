package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class BicyclesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bicycles)

        val btnParts = findViewById<Button>(R.id.btnParts)
        val btnAccessories = findViewById<Button>(R.id.buttonAccessories)
        val btnOffers = findViewById<ImageButton>(R.id.btnOffers)

        // Navegar a PartsActivity
        btnParts.setOnClickListener {
            val intent = Intent(this, PartsActivity::class.java)
            startActivity(intent)
        }

        // Navegar a AccessoriesActivity
        btnAccessories.setOnClickListener {
            val intent = Intent(this, AccessoriesActivity::class.java)
            startActivity(intent)
        }

        // Navegar a OffersActivity
        btnOffers.setOnClickListener {
            val intent = Intent(this, OffersActivity::class.java)  // Si tienes una actividad para "Ofertas"
            startActivity(intent)
        }
    }
}
