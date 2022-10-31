package com.example.calculadoragrupo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButtonToggleGroup

/*************************************************************
 * Desarrollo realizado por:
 * Alexander Parra Lopez
 * Yesid Leonardo Camargo Roldan
 * Materia: PROGRAMACIÓN EN PLATAFORMAS MÓVILES I
 * Docente: Ing. Robert Osorio Torres
 *************************************************************/

class MainActivity : AppCompatActivity() {

    lateinit var NumeroUno : EditText
    lateinit var NumeroDos : EditText
    lateinit var Resultado : EditText
    lateinit var Boton_Sumar: Button;
    lateinit var Boton_Restar: Button;
    lateinit var Boton_Multiplicar: Button;
    lateinit var Boton_Dividir: Button;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NumeroUno = this.findViewById(R.id.editTextNumber)
        NumeroDos = this.findViewById(R.id.editTextNumber2)
        Resultado = this.findViewById(R.id.textView_Resultado)
        Boton_Sumar = findViewById(R.id.Boton_Suma)
        Boton_Restar = findViewById(R.id.Boton_Resta)
        Boton_Dividir = findViewById(R.id.Boton_Division)
        Boton_Multiplicar = findViewById(R.id.Boton_Multiplicacion)

        Boton_Sumar.setOnClickListener {
            var num1:String = NumeroUno.text.toString()
            var num2:String = NumeroDos.text.toString()
            var result = (num1.toFloat() + num2.toFloat())
            Resultado.setText(result.toString())
        }

        Boton_Restar.setOnClickListener {
            var num1:String = NumeroUno.text.toString()
            var num2:String = NumeroDos.text.toString()
            var result = (num1.toFloat() - num2.toFloat())
            Resultado.setText(result.toString())
        }

        Boton_Dividir.setOnClickListener {
            var num1:String = NumeroUno.text.toString()
            var num2:String = NumeroDos.text.toString()
            var result = (num1.toFloat() / num2.toFloat())
            Resultado.setText(result.toString())
        }

        Boton_Multiplicar.setOnClickListener {
            var num1:String = NumeroUno.text.toString()
            var num2:String = NumeroDos.text.toString()
            var result = (num1.toFloat() * num2.toFloat())
            Resultado.setText(result.toString())
        }
    }
}