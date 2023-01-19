package com.example.ejercicio_8_raza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var humano = findViewById<Button>(R.id.humano)
        humano.setOnClickListener { cambioFoto(humano.text.toString()) }

        var goblin = findViewById<Button>(R.id.goblin)
        goblin.setOnClickListener { cambioFoto(goblin.text.toString()) }

        var elfo = findViewById<Button>(R.id.elfo)
        elfo.setOnClickListener { cambioFoto(elfo.text.toString()) }

        var Enano = findViewById<Button>(R.id.enano)
        Enano.setOnClickListener { cambioFoto(Enano.text.toString()) }


        findViewById<Button>(R.id.aceptar).setOnClickListener{cambioPagina()}
    }


    private fun cambioFoto(text: String) {

        val imagen = findViewById<ImageView>(R.id.imageView)

        if (text.equals("Humano"))
            imagen.setImageResource(R.drawable.humano)

        if (text.equals("Goblin"))
            imagen.setImageResource(R.drawable.goblin)

        if (text.equals("Elfo"))
            imagen.setImageResource(R.drawable.elfo)

        if (text.equals("Enano"))
            imagen.setImageResource(R.drawable.enano)
    }
    private fun cambioPagina() {
        val intent = Intent(this, Activity::class.java)
        startActivity(intent)
    }
}
