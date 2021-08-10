import Loja.Fatura
import Loja.Item

fun main() {
  var banana = Item(1, "Banana", 5, 5.0)
  var maca = Item(2, "maça", 5, 3.0)
  var laranja = Item(3, "Laranja", 3, 2.5)
  var listaItens1: ArrayList<Item> = arrayListOf(banana, maca, laranja)

  var fatura1 = Fatura(listaItens1)
  println("O total da fatura é R$ ${fatura1.totalDaFatura()}")

}
