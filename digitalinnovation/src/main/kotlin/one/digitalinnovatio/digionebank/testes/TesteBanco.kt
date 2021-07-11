package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.Banco

fun main() {
    val digionebank = Banco ("digione", 12)
    println(digionebank.nome)
    println(digionebank.numero)
}