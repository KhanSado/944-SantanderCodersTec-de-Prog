package aula2

import kotlin.system.measureTimeMillis

fun soma(a: Int, b: Int): Int {
    Thread.sleep(1000L)
    return a + b
}

fun main() {
    val tempo = measureTimeMillis {
        val soma1 = soma(10,2)
        val soma2 = soma(9,8)

        println("T1: ${soma1}")
        println("T2: ${soma2}")
    }

    println("Tempo de Execuçao: ${tempo} ms")
}