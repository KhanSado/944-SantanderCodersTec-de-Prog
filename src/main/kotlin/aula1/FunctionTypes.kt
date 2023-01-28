package aula1

// CalculaDesconto
val calculaDesconto: (Double, Double) -> Double = { valor, desconto ->
    (desconto*valor)/100
}

fun main(){
    println(calculaDesconto(120.0, 3.0))
}