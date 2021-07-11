package one.digitalinnovatio.digionebank.testes

import one.digitalinnovatio.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    //ou
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}
