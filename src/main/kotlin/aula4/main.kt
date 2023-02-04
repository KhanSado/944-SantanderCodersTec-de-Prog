package aula4

import java.time.LocalDate

class Exemplo {
    fun deDentroDaClasse(){
        println("Dentro da classe")
    }
}

fun main(){
    Exemplo().deDentroDaClasse()
    Exemplo().externaFuncao()

    println("------------------")

    println(3.quemEh())

    println("------------------")

    println(12.5.formatarReal())

    println("------------------")

    println("+Guilherme".removeFirst())

    println("------------------")

    println(LocalDate.now().yesterday().formatador)
    println(LocalDate.now().tomorrow().formatador)

    println("------------------")

    var herois = mutableListOf("Batman", "Cyborg", "Flash")
    println(herois)
    herois.troca(0, 1)
    println(herois)
}