package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.controledenotas.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {

            val nota1 = nota1.text.toString().toDouble()
            val nota2 = nota2.text.toString().toDouble()
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final: " + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.GREEN)
            } else if (media>=6 && faltas > 10) {
                resultado.setText("Aluno Reprovado por falta" + "\n" + "Nota Final: " + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }
            else  if (media <=6 && faltas <=10 ){
                resultado.setText("Aluno Reprovado por Nota" + "\n" + "Nota Final: " + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }
                else {
                resultado.setText("Aluno Reprovado por Nota e Falta" + "\n" + "Nota Final: " + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
                }

        }
    }
}