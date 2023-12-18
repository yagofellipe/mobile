package com.yagofellipe.colection.teste

fun main() {

    val listaLanches = listOf("hamburguer")
    val listaBebida = listOf("coca")

    val listaUnion = listaBebida + listaLanches

    println(listaUnion)
}