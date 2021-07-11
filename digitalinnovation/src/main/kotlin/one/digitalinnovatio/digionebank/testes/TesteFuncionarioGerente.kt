package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria do carmo","1232314142",5000.0,"senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}

