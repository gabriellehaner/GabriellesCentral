package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class quartofragmento: Fragment (R.layout.quartofragmento){
    private lateinit var binding: quartofragmento




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaosaircalculadora).setOnClickListener {

            findNavController().navigate(R.id.quartofragmentoparasegundofragmento)
        }

            view.findViewById<Button>(R.id.calcularbotao).setOnClickListener {
                calcularImc()

            }
    }

    fun calcularImc() {
        val peso = view?.findViewById<EditText>(R.id.campopeso)?.text.toString().toDouble()
        val altura = view?.findViewById<EditText>(R.id.campoaltura)?.text.toString().toDouble()

        val camporesultado = view?.findViewById<EditText>(R.id.camporesultado)
        val campoparametro = view?.findViewById<TextView>(R.id.campoparametro)

        var resultado = peso / (altura * altura)

        camporesultado?.setText(" %.2f".format(resultado))

        if (resultado <= 18.5) {
            campoparametro?.setText("Desnutrição")
        }else if (resultado >= 18.6 && resultado <= 24.9) {
            campoparametro?.setText("Normal")
        }else if (resultado >= 25 && resultado <= 29.9) {
            campoparametro?.setText("Sobrepeso")
        }else if (resultado >= 30 && resultado <= 39.9) {
            campoparametro?.setText("Obesidade I")
        }else if (resultado >= 40) {
            campoparametro?.setText("Obesidade II")
        }
    }

}


