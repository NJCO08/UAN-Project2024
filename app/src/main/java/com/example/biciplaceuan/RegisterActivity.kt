package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Encontrar el botón
        val loginButton = findViewById<Button>(R.id.login_button)

        // Configurar el listener para el botón
        loginButton.setOnClickListener {
            // Crear un Intent para ir a BicyclesActivity
            val intent = Intent(this, BicyclesActivity::class.java)
            startActivity(intent)
        }
    }
}




