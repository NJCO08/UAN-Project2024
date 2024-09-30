package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Inicializa tus vistas

        val btnLogout = findViewById<Button>(R.id.logout_button)
        val btnInicio = findViewById<ImageButton>(R.id.btnInicio)
        val btnOffers = findViewById<ImageButton>(R.id.btnOffers)
        val btnSells = findViewById<ImageButton>(R.id.btnSells)
        val btnChat = findViewById<ImageButton>(R.id.btnChat)

        // Configura el botón para cerrar sesión
        btnLogout.setOnClickListener {
            finishAffinity() // Esto cierra todas las actividades de la app
        }

        // Navegar a BicyclesActivity desde btnInicio
        btnInicio.setOnClickListener {
            val intent = Intent(this, BicyclesActivity::class.java)
            startActivity(intent)
        }

        // Navegar a OffersActivity desde btnOffers
        btnOffers.setOnClickListener {
            val intent = Intent(this, OffersActivity::class.java)
            startActivity(intent)
        }

        // Navegar a SellsActivity desde btnSells
        btnSells.setOnClickListener {
            val intent = Intent(this, SellsActivity::class.java)
            startActivity(intent)
        }

        // Navegar a ChatActivity desde btnChat
        btnChat.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}
