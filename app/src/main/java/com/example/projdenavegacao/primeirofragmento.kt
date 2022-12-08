package com.example.projdenavegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class primeirofragmento: Fragment (R.layout.primeirofragmento){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaologin).setOnClickListener {

            findNavController().navigate(R.id.primeirofragmentoparasegundofragmento)
        }
        view.findViewById<Button>(R.id.cadastrobotao).setOnClickListener {

            findNavController().navigate(R.id.action_primeirofragmento_to_terceirofragmento2)
        }
    }
}