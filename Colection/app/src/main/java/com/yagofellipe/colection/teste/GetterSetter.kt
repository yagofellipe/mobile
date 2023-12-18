package com.yagofellipe.colection.teste

class Carro {
    var cor: String = ""
    var ano: Int = 0

    fun getCor(color: String){
        cor = color
    }
}

fun main() {
    val carro = Carro()
    carro.getCor("amarelo")

    println(carro.cor)
}