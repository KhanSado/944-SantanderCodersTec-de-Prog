package aula2

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun somar(a: Int, b: Int): Int {
    delay(1000L)
    return a + b
}

fun main() = runBlocking{
    val tempo = measureTimeMillis {
        val soma1 = async { somar(10,2) }
        val soma2 = async { somar(9,8) }

        println("T1: ${soma1.await()}")
        println("T2: ${soma2.await()}")
    }

    println("Tempo de Execuçao: ${tempo} ms")
}