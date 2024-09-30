package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class OffersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offers)

        // Botones de navegación
        val btnInicio = findViewById<ImageButton>(R.id.btnInicio)
        val btnSells = findViewById<ImageButton>(R.id.btnSells)
        val btnChat = findViewById<ImageButton>(R.id.btnChat)
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

        // Navegar a ChatActivity
        btnChat.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }

        // Navegar a ProfileActivity
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
