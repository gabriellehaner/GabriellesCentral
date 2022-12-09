package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class quintofragmento: Fragment (R.layout.quintofragmento){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaosairconversor).setOnClickListener {

            findNavController().navigate(R.id.quintofragmentoparasegundofragmento)
        }
        view.findViewById<Button>(R.id.calculartemp).setOnClickListener {
            converter()

        }
    }

    fun converter(){

        val temperatura = view?.findViewById<EditText>(R.id.inserirtemperatura)?.text.toString().toDouble()
        val botaocelsius1 = view?.findViewById<RadioButton>(R.id.botaocelsius1)
        val fahrenheitbotao1 = view?.findViewById<RadioButton>(R.id.fahrenheitbotao1)
        val kelvinbotao1 = view?.findViewById<RadioButton>(R.id.kelvinbotao1)
        val botaocelsius2 = view?.findViewById<RadioButton>(R.id.botaocelsius2)
        val fahrenheitbotao2 = view?.findViewById<RadioButton>(R.id.fahrenheitbotao2)
        val kelvinbotao2 = view?.findViewById<RadioButton>(R.id.kelvinbotao2)
        val resultado = view?.findViewById<EditText>(R.id.resultado)


        if (botaocelsius1?.isChecked == true  && fahrenheitbotao2?.isChecked == true){
            val result = (temperatura * 1.8) + 32
            resultado?.setText("%.2f".format(result))

        } else if (botaocelsius1?.isChecked == true && kelvinbotao2?.isChecked == true){
            val result = temperatura + 273
            resultado?.setText("%.2f".format(result))

        } else if (botaocelsius1?.isChecked == true && botaocelsius2?.isChecked == true) {
                val result = temperatura
                resultado?.setText("%.2f".format(result))

        } else if (fahrenheitbotao1?.isChecked == true && botaocelsius2?.isChecked == true) {
            val result = (temperatura - 32) / 18
            resultado?.setText("%.2f".format(result))

        } else if (fahrenheitbotao1?.isChecked == true && kelvinbotao2?.isChecked == true) {
            val result = (temperatura + 45967) * 5 / 9
            resultado?.setText("%.2f".format(result))

        } else if (fahrenheitbotao1?.isChecked == true && fahrenheitbotao2?.isChecked == true) {
            val result = temperatura
            resultado?.setText("%.2f".format(result))

        } else if (kelvinbotao1?.isChecked == true && botaocelsius2?.isChecked == true) {
            val result = temperatura - 273
            resultado?.setText("%.2f".format(result))

        } else if (kelvinbotao1?.isChecked == true && fahrenheitbotao2?.isChecked == true) {
            val result = ((temperatura - 273) * 9/5) + 32
            resultado?.setText("%.2f".format(result))

        } else if (kelvinbotao1?.isChecked == true && kelvinbotao2?.isChecked == true) {
            val result = temperatura
            resultado?.setText("%.2f".format(result))
        }}

}