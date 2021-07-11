package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.Analista

fun main() {

    val joao = Analista("Joao Pedro","1232314142",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

