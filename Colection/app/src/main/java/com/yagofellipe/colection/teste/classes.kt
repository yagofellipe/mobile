package com.yagofellipe.colection.teste

/*class Motorista(val nome: String) {
    fun exibirDadosNome() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String) {
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }
}*/

data class Pergunta( val pergunta: String, val respontaCerta: Int){

}

fun main() {

    val pergunta1 = Pergunta("Qual a pergunta", 1)
    val pergunta2 = Pergunta("Qual a pergunta", 1)

    val (pergunta, resposta) = pergunta1

    println(pergunta)
}
/*

    val caminhao = Motorista.Caminhao("FH 60")
    caminhao.exibirDadosCaminhao()
    */
/*val motorista = Motorista("Yago")
    motorista.exibirNome()*/



