package digionebank.testes

import digionebank.ClienteTipo

fun printDescricao() = ClienteTipo.values().forEach { println("${it.descricao}") }

fun main() {
    val clienteA = ClienteTipo.PF
    val clienteB = ClienteTipo.PJ
    println("Cliente B  = ${clienteA.descricao}")
    println("Cliente A  = ${clienteB.descricao}")
    printDescricao()
}