package com.example.biciplaceuan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SellsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)

        // Inicializa los botones de navegación
        val btnOffers = findViewById<ImageButton>(R.id.btnOffers) // Cambia a R.id.btnOffers
        val btnInicio = findViewById<ImageButton>(R.id.btnInicio)
        val btnChat = findViewById<ImageButton>(R.id.btnChat)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)

        // Navegar a OffersActivity
        btnOffers.setOnClickListener {
            val intent = Intent(this, OffersActivity::class.java)
            startActivity(intent)
        }

        // Navegar a BicyclesActivity (Inicio)
        btnInicio.setOnClickListener {
            val intent = Intent(this, BicyclesActivity::class.java)
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

        // Configura el Spinner de colores
        val colorSpinner: Spinner = findViewById(R.id.color_spinner)

        // Crea una lista de colores
        val colors = arrayOf("Rojo", "Verde", "Azul", "Amarillo")

        // Crea un adaptador para el Spinner de colores
        val adapterColor = ArrayAdapter(this, android.R.layout.simple_spinner_item, colors)
        adapterColor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        colorSpinner.adapter = adapterColor

        // Maneja la selección del Spinner de colores
        colorSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedColor = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@SellsActivity, "Color seleccionado: $selectedColor", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No se seleccionó ningún elemento
            }
        })

        // Configura el Spinner de categorías
        val categorySpinner: Spinner = findViewById(R.id.spCategory)

        // Crea una lista de categorías
        val categories = arrayOf("Bicicletas", "Partes", "Accesorios")

        // Crea un adaptador para el Spinner de categorías
        val adapterCategory = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapterCategory.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categorySpinner.adapter = adapterCategory

        // Maneja la selección del Spinner de categorías
        categorySpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedCategory = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@SellsActivity, "Categoría seleccionada: $selectedCategory", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No se seleccionó ningún elemento
            }
        })
    }
}
