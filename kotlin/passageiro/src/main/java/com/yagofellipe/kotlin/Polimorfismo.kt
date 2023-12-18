package com.yagofellipe.kotlin

class Usuario constructor(nome: String, sobrenome: String) {

    var nome: String = "";
    var sobrenome: String = "";

    init {
        this.nome = nome;
        this.sobrenome = sobrenome
        println("Objeto inicializado");
    }
    fun logar(email: String, senha: String) {

    }

    fun logar(number: Number, biometria: String) {

    }

}



fun main() {
    val usuario = Usuario("yago", "fellipe");
    println(usuario.nome)
}