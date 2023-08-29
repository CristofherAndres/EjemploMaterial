package com.example.ejemplomaterial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class ejemplo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo)
    }

    fun sumar(view: View) {
        Log.i("Prueba", "Funciona el botón")

        try {
            val num1: Int = findViewById<TextInputEditText>(R.id.etNum1).text.toString().toInt()
            val num2: Int = findViewById<TextInputEditText>(R.id.etNum2).text.toString().toInt()
            val resultado: Int = num1 + num2

            findViewById<TextView>(R.id.tvResultado).setText("El resultado es: $resultado")

            Toast.makeText(this, "El resultado es: $resultado", Toast.LENGTH_LONG).show()

            Log.e("Resultado", "El resultado es: $resultado")

        } catch ( e: Exception) {
            Log.e("Error", "Error al sumar: + $e")
        }

    }

}