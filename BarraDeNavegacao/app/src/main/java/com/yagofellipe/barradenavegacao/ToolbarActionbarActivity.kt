package com.yagofellipe.barradenavegacao

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ToolbarActionbarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityToolbarActionbarBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

    private fun inicializarToolbar(){

        binding.tbPrincipal.title = "Youtube"

        setSupportActionBar(binding.tbPrincipal)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_adicionar -> {
                Toast.makeText(this,"Adicionar", Toast.LENGTH_SHORT)
            }
            R.id.item_pesquisar -> {
                Toast.makeText(this,"Pesquisar", Toast.LENGTH_SHORT)
            }
            R.id.item_sair -> {
                Toast.makeText(this,"Sair", Toast.LENGTH_SHORT)
            }
            R.id.item_configuracoes -> {
                Toast.makeText(this,"Confi",Toast.LENGTH_SHORT)
            }
        }
        return true
    }
}