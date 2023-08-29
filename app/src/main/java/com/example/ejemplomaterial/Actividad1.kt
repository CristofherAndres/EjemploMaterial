package com.example.ejemplomaterial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView

class Actividad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad1)
    }

    fun sumar(view: View) {
        //Leer los valores de los EditText

        //Escribir en el terminal
        Log.i("Prueba", "Probando el onClick")


        try {
            val num1: Int = findViewById<TextInputEditText>(R.id.tietNum1).text.toString().toInt()
            Log.i("Prueba", "El numero 1 es: $num1")
            val num2: Int = findViewById<TextInputEditText>(R.id.tietNum2).text.toString().toInt()
            Log.i("Prueba", "El numero 2 es: $num2")

            val resultado = num1 + num2
            Log.i("Suma", "El resultado es: $resultado")

            //Salida en un Toast
            //Toast.makeText(this, "El resultado es: $resultado", Toast.LENGTH_LONG).show()

            //Mostar en resultado
            val salida = "El resultado es $resultado"
            findViewById<MaterialTextView>(R.id.tvResultado).setText(salida.toString())


        } catch (e: Exception) {
            Log.e("Prueba", "Error al convertir el número: ${e.message}")
        }




    }
}