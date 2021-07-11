package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.Cliente
import one.digitalinnovatio.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(nome = " Jose da Silva", cpf = "212323131",clienteTipo = ClienteTipo.PF, senha = "123456")

    println(jose)
    TesteAutenticacao().autentica(jose)
}