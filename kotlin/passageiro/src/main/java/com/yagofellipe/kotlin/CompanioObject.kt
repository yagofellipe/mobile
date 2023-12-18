package com.yagofellipe.kotlin

class Carroo(
    var model: String = "",
    var velo: Int = 0
)   {
    fun exibirInformacoes(){
        println("$model, $velo")
    }

    companion object{
        const val VELOCIDADE_MAX_PERMITIDA = 120;
    }
}

fun main(){
    println(Carroo.VELOCIDADE_MAX_PERMITIDA)
    val carro = Carroo("fusca",100);
    carro.exibirInformacoes()
}