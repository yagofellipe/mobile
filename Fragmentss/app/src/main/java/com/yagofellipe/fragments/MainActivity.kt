package com.yagofellipe.fragments

import android.annotation.SuppressLint
import android.app.people.ConversationStatus
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, conversasFragment())
                .commit()
        }

            btnChamadas.setOnClickListener {
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainerView, ChamadaFragment())
                    .commit()
            }
    }
}