package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Botones de navegación
        val btnInicio = findViewById<ImageButton>(R.id.btnInicio)
        val btnSells = findViewById<ImageButton>(R.id.btnSells)
        val btnOffers = findViewById<ImageButton>(R.id.btnOffers)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)

        // Navegar a BicyclesActivity (Inicio)
        btnInicio.setOnClickListener {
            val intent = Intent(this, BicyclesActivity::class.java)
            startActivity(intent)
        }

        // Navegar a SellsActivity
        btnSells.setOnClickListener {
            val intent = Intent(this, SellsActivity::class.java)
            startActivity(intent)
        }

        // Navegar a OffersActivity
        btnOffers.setOnClickListener {
            val intent = Intent(this, OffersActivity::class.java)
            startActivity(intent)
        }

        // Navegar a ProfileActivity
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}

