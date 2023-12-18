package com.yagofellipe.colection.teste


/*fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun calcular(funcao: (Int, Int) -> Int){

}*/

class Botao {
    fun configurarCliqueBotao(funcao: () -> Unit) {

    }
}


fun main() {
    // funcao lambda
    val botao = Botao()
    botao.configurarCliqueBotao {
        println("Click")
    }
}
