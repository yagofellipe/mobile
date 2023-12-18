package com.yagofellipe.colection.teste

// chave:valor

fun main() {

    val lista = mapOf(0 to "produto1", 1 to "produto2")

    lista.forEach{produto ->
        println("${produto.key} ${produto.value}")
    }
}