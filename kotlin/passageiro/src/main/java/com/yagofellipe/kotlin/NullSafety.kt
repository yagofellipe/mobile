package com.yagofellipe.kotlin

class Carro{
    var cor = "vermelho";
    fun acalerar(){
        println()
    }
}
fun main(){
    val carro: Carro? = null;

    println(carro?.cor)
}