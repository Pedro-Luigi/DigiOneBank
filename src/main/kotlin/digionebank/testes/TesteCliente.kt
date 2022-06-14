package digionebank.testes

import digionebank.Cliente
import digionebank.ClienteTipo

fun main() {
    val jose = Cliente("Jose", "123123123-23", ClienteTipo.PF, "123456")

    println(jose)
    TesteAutenticacao().autenticacao(jose)
}