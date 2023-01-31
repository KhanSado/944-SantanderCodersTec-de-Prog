package aula3

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

fun main1(){
    val name = CoroutineName("Koroutine")
    val elemento: CoroutineContext.Element = name
    val context: CoroutineContext = elemento

    println(context)

    val job = Job()
    val jobElemento: CoroutineContext.Element = job
    val jobContext: CoroutineContext = jobElemento

    println(jobContext)
}