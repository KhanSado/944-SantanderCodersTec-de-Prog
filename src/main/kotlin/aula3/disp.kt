package aula3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main2() = runBlocking {
    launch(Dispatchers.IO) {
        println(coroutineContext)

        withContext(Dispatchers.Default){
            println(coroutineContext)
        }
    }
    print("")
}