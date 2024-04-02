package com.example.globoplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class filmes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filmes)
        setSupportActionBar(findViewById(R.id.toolbar))
        val img = findViewById<ImageView>(R.id.imgfilme)
        val titulo = findViewById<TextView>(R.id.titulo)
        val tipo = findViewById<TextView>(R.id.tipo)
        val enredo = findViewById<TextView>(R.id.enredo)
        val titulorg = findViewById<TextView>(R.id.titulooriginal)
        val genero = findViewById<TextView>(R.id.genero)
        val ano = findViewById<TextView>(R.id.ano)
        val pais = findViewById<TextView>(R.id.pais)
        val diretor = findViewById<TextView>(R.id.diretor)
        val elenco = findViewById<TextView>(R.id.elenco)
        val idimg = intent.getIntExtra("id_img", 0)
        val idtitulo = intent.getStringExtra("titulo")
        val idtipo = intent.getStringExtra("tipo" )
        val idenredo = intent.getStringExtra("Enredo" )
        val idtituloorg = intent.getStringExtra("tituloorig" )
        val idgenero = intent.getStringExtra("genero" )
        val idano = intent.getStringExtra("ano")
        val idpais = intent.getStringExtra("pais")
        val iddiretor = intent.getStringExtra("direcao")
        val idelenco = intent.getStringExtra("elenco")
        img.setImageResource(idimg)
        titulo.setText(idtitulo)
        tipo.setText(idtipo)
        enredo.setText(idenredo)
        titulorg.setText(idtituloorg)
        genero.setText(idgenero)
        ano.setText(idano)
        pais.setText(idpais)
        diretor.setText(iddiretor)
        elenco.setText(idelenco)

    }
}