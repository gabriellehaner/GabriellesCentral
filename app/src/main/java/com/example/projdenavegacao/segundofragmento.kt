package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class segundofragmento: Fragment (R.layout.segundofragmento){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaoconcluir).setOnClickListener {

            findNavController().navigate(R.id.segundofragmentoparaprimeirofragmento)}

            view.findViewById<Button>(R.id.botaocalculadora).setOnClickListener {

                findNavController().navigate(R.id.segundofragmentoparaquartofragmento)}

                view.findViewById<Button>(R.id.botaoconversor).setOnClickListener {

                    findNavController().navigate(R.id.segundofragmentoparaquintofragmento)}

        view.findViewById<EditText>(R.id.nome).setOnClickListener {

            }
        }
    }