package com.yagofellipe.kotlin

abstract class Animal{  //classe abstrata
    var cor = "";
    var tamanho = "";
    var peso = 0.0;

    open fun correr(){
        print("correndo ");
    }
}

class Cao: Animal() { // class concreta
    override fun correr(){
        super.correr();
        println("como cachorro");
    }
}

fun main(){
    val cachorro = Cao();
    // val testabstrata = Animal(); não pode instanciar, pois é abstrata
    cachorro.correr();
}