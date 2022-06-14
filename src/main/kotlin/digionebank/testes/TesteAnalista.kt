package digionebank.testes

import digionebank.Analista
import digionebank.Funcionario

fun main() {
    val pedro = Analista("Pedro Henrique", "123.123.123-12", 2000.0)
    imprimirSalario(pedro)
}

fun imprimirSalario(funcionario: Funcionario) = println(funcionario.toString())
