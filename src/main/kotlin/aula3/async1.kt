package aula3

import kotlinx.coroutines.*

private suspend fun apiCall1(): String {
    delay(2000L)
    return "Chamou o endpoint 1"
}

private suspend fun apiCall2(): String {
    delay(1000L)
    return "Chamou o endpoint 2"
}

fun main() = runBlocking {
    launch(Dispatchers.IO) {
        val apicall1 = async { apiCall1() }.await()
        val apicall2 = async { apiCall2() }

        println(apicall1)
        println(apicall2.await())
    }
    print("")
}