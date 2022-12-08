package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class quintofragmento: Fragment (R.layout.quintofragmento){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaosairconversor).setOnClickListener {

            findNavController().navigate(R.id.quintofragmentoparasegundofragmento)
        }
    }
}