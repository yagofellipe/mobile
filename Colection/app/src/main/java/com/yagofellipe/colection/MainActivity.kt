package com.yagofellipe.colection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mandando criar um identificador para btn_executar com a classe R
        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)



        /*
        // criando evento de click
        btnExecutar.setOnClickListener {
            textResultado.text = "Yago Fellipe"
        }
        */

    }

    // quando houver o click, esse método vai ser chamado.
    fun cliqueBotao( view: View) {
        Toast.makeText(this,
            "sucesso",
            Toast.LENGTH_LONG
        ).show()


        textResultado.text = "Yago Fellipe"
    }
}