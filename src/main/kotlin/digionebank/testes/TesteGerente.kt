package digionebank.testes

import digionebank.Gerente

fun main() {
    val gustavo = Gerente("Gustavo", "123.123.123-12", 7000.0,"senha123")
    //Não vou recriar a função imprimirSalario porque ela já existe em TesteAnalista, com isso só reutilizar.
    imprimirSalario(gustavo)

    TesteAutenticacao().autenticacao(gustavo)
}
