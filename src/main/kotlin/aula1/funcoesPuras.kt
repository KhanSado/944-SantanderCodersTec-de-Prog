package aula1

//(potencia*hora*dia)/1000
fun calculoConsumo(potencia: Int, horas: Int, dias: Int){
    val kwh = (potencia*horas*dias)/1000
    println("Esse equipamento gasta ${kwh} kWh em ${dias} dias")
}

fun saudacao(nome: String){
    println("Olá ${nome}, como vai ?")
}
fun main(){
    calculoConsumo(120, 24, 30)
    saudacao("Eduardo")
}