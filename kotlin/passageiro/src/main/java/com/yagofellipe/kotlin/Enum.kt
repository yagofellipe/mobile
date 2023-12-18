package com.yagofellipe.kotlin

enum class StatusPedido {
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIANDO,
    PEDIDO_ENTREGUE

}
class Pedido (
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}
fun main(){
    val pedido = Pedido(125.90, "camiseta, livro");
    pedido.statusPedido = StatusPedido.AGUARDANDO_APROVACAO;

    pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO;

    println("StatusPedido: ${StatusPedido.PAGAMENTO_CONFIRMADO}")

    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("O seu pedido foi realizado");
    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("Pagamento aprovado");
    }
}