package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
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


            }

    }

}


