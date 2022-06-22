package com.example.myapplicationwearable

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
//Enlazar elementos de la vista con el codigo
import com.example.myapplicationwearable.databinding.ActivityMainBinding


class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Asignado el valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Modificar el valor del TextView
        //binding.text.text="La vinculación de vista es una función que te permite escribir más fácilmente código que interactúa con las vistas."
        binding.btnCheck.setOnClickListener{
            Toast.makeText(this, "Aceptar", Toast.LENGTH_SHORT).show()
        }
        binding.btnCancel.setOnClickListener{
            Toast.makeText(this, "Cancelar", Toast.LENGTH_SHORT).show()
        }
    }
}