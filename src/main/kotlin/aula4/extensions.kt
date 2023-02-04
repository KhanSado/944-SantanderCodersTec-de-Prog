package aula4

import java.text.DecimalFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun Exemplo.externaFuncao(){
    println("Função extendida de exemplo")
}

fun Int.quemEh(): Int {
    return this
}

fun Double.formatarReal(): String {
    val brazilianFormat =
        DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return brazilianFormat.format(this)
}

// Criar uma extension que traga um valor dobrado

// Criar uma extension que faça uma operação matemática básica

// +Guilherme - Leio arquivo do csv, e o mesmo vem
// com um caracter especial no inicio de cada nome
// criar uma extension que remova o primeiro caracter
fun String.removeFirst() = this.drop(1) //Solução: Mauro

//Usando o LocalDate, definir que dia é amanha e que dia foi ontem, usando extensions
fun LocalDate.yesterday(): LocalDate {
    return this.minusDays(1)
}
fun LocalDate.tomorrow():LocalDate{
    return this.plusDays(1)
}
//Solução: Orlando + Gabriel Moura

val LocalDate.formatador : String
    get() = this.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))



fun <T> MutableList<T>.troca(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

// listOf("asd", "uiouasuio", "sa")
// "uiouasuio"
fun List<String>.maior() {
    var maior = this[0]
    for(item in this) {
        if(item.length > maior.length) {
            maior = item
        }
    }
    println(maior)
}