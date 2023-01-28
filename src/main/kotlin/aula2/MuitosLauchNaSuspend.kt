package aula2

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun cumprimentaNomeCompleto(nome: String, sobrenome: String, sobrenome2: String) = coroutineScope {
    launch {
        delay(2000L)
        print(sobrenome2)
    }

    launch {
        delay(4000L)
        print(sobrenome)
    }

    launch {
        delay(6000L)
        print(nome)
    }

    print("Boa noite")
}

fun main()  = runBlocking {
    cumprimentaNomeCompleto(" João", " Vitor", "Queiroz")
    print(", tudo bem ?")
}