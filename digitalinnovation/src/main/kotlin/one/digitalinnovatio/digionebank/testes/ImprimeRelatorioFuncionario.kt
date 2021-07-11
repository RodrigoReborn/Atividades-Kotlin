package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(Funcionario: Funcionario){
            println(
                Funcionario.toString()
            )
        }
    }
}