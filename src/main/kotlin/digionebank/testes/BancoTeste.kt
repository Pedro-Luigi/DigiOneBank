package digionebank.testes

import digionebank.Banco

fun main(){
    val digiBankOne = Banco("DigiOne", 12)

    println(digiBankOne.info())
}