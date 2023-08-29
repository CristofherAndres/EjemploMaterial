package com.example.ejemplomaterial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        //Leer boton
        val botonSumar = findViewById<Button>(R.id.btnSumar);
        val btn0 = findViewById<Button>(R.id.btn0);
        val btn1 = findViewById<Button>(R.id.btn1);
        val btn2 = findViewById<Button>(R.id.btn2);
        val btn3 = findViewById<Button>(R.id.btn3);
        val btn4 = findViewById<Button>(R.id.btn4);
        val btn5 = findViewById<Button>(R.id.btn5);
        val btn6 = findViewById<Button>(R.id.btn6);
        val btn7 = findViewById<Button>(R.id.btn7);
        val btn8 = findViewById<Button>(R.id.btn8);
        val btn9 = findViewById<Button>(R.id.btn9);
        val btnPunto = findViewById<Button>(R.id.btnPunto);
        val btnIgual = findViewById<Button>(R.id.btnIgual);
        val btnRestar = findViewById<Button>(R.id.btnRestar);
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar);
        val btnDividir = findViewById<Button>(R.id.btnDividir);
        val btnBorrar = findViewById<Button>(R.id.btnBorrar);
        val btnBorrarTodo = findViewById<Button>(R.id.btnBorrarTodo);

        //Leer el boton y anotar en el editText
        btn0.setOnClickListener {
            val num0 = "0"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num0.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num0.toString())
            }
        }
        btn1.setOnClickListener {
            val num1 = "1"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num1.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num1.toString())
            }
        }
        btn2.setOnClickListener {
            val num2 = "2"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num2.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num2.toString())
            }
        }
        btn3.setOnClickListener {
            val num3 = "3"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num3.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num3.toString())
            }
        }
        btn4.setOnClickListener {
            val num4 = "4"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num4.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num4.toString())
            }
        }
        btn5.setOnClickListener {
            val num5 = "5"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num5.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num5.toString())
            }
        }
        btn6.setOnClickListener {
            val num6 = "6"
            //Tomar el valor actual
            val valorActual = findViewById<TextView>(R.id.tvResult).text.toString()
            //Concatenar el valor actual con el nuevo si es diferente de 0
            if (valorActual != "0") {
                findViewById<TextView>(R.id.tvResult).setText(valorActual + num6.toString())
            } else {
                findViewById<TextView>(R.id.tvResult).setText(num6.toString())
            }
        }

        btnPunto.setOnClickListener {
            val punto = "."
            findViewById<TextView>(R.id.tvResult).setText(punto.toString())
        }
        btnIgual.setOnClickListener {
            val igual = "="
            findViewById<TextView>(R.id.tvResult).setText(igual.toString())
        }
        btnMultiplicar.setOnClickListener {
            val multiplicar = "*"
            findViewById<TextView>(R.id.tvResult).setText(multiplicar.toString())
        }
        btnDividir.setOnClickListener {
            val dividir = "/"
            findViewById<TextView>(R.id.tvResult).setText(dividir.toString())
        }

        //Tomar TextView y operar cuando pulse el boton =

        botonSumar.setOnClickListener {
            //Leer textView
            val operacion = findViewById<TextView>(R.id.tvResult).text.toString().toInt()
            //Separar la operacion en numeros y signos
            Log.d("Prueba", "La operación es: $operacion");
        }


    }
}