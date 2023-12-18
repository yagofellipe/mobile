package com.yagofellipe.activityandfragments

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras // todos os parâmetros passados
        if (bundle != null){
//            val filme = bundle.getString("filme")
//            val classificacao = bundle.getInt("classificacao")
//            val avaliacoes = bundle.getDouble("avaliacoes")
//
//            val resultado = "filme: $filme - class. $classificacao aval. $avaliacoes"

            val filme = bundle.getSerializable("filme", Filme::class.java)


        }

        buttonFechar.setOnClickListener {
            finish()
        }
    }
}