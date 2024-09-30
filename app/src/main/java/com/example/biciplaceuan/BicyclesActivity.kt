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

        // Inicializar los botones
        val btnParts = findViewById<Button>(R.id.btnParts)
        val btnAccessories = findViewById<Button>(R.id.buttonAccessories)
        val btnSells = findViewById<ImageButton>(R.id.btnSells)
        val btnOffers = findViewById<ImageButton>(R.id.btnOffers)
        val btnChat = findViewById<ImageButton>(R.id.btnChat)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)
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

        // Navegar a ChatActivity
        btnChat.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}

