package Loja

class Fatura(val numeroDeItens: ArrayList<Item>) {

    fun totalDaFatura(): Double {
        var soma = 0.0
        numeroDeItens.forEach { item -> soma += item.preco * item.quantidade }
        return soma
    }
}

    // "Modo que estavamos tentando fazer"

    //fun totalDaFatura(): Double {
    // var contadora: Double = 0.0
    // for (procura in numeroDeItens) {
    //    contadora += procura.preco * procura.quantidade

    // }
    // return contadora
    // }
//}
