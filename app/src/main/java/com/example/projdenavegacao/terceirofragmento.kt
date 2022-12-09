package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class terceirofragmento: Fragment (R.layout.terceirofragmento){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaoconcluir1).setOnClickListener {

            findNavController().navigate(R.id.terceirofragmentoparasegundofragmento)
        }

    }
}