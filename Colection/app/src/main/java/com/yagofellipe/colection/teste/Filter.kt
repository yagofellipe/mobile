package com.yagofellipe.colection.teste

fun main() {

    val listaFrutas = listOf("maçã", "laranja", "banana", "oaooo")

    val novaLista = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }

    val novaLista2 = listaFrutas.filter {nome ->
        nome.contains("a")
    }
    println(novaLista2)
}

