package com.yagofellipe.kotlin

open class Pessoa {
    open fun comer(){
        println("comer");
    }
}

class DesenvolvedorAndroid : Pessoa() {
    override fun comer(){
        super.comer()
    }
}



fun main(){
    val pessoa = DesenvolvedorAndroid();
    pessoa.comer()
}