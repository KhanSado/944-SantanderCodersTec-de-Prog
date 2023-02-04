package aula5

fun main(){
    println("--------------------")
        val patternNumbers = Regex("[\\d]+")
                    // Regex("[0-9]\\.[0-9]")
                    // Regex("3[0-9]{3}")
                    // Regex("[0-9]*")
                    // Regex("[0-9]")
                    // Regex("1")
        val numberTest = "678"
        println("NumberTest: ${numberTest.matches(patternNumbers)}")

    println("--------------------")

    val patternLetters = Regex("[\\w]+")
                    // Regex("[a-zA-Z]{4,5}")
                    // Regex("[gG][a-zA-Z]+")
                    // Regex("[a-zA-Z]+")
                    // Regex("[a-zA-Z]")
                    // Regex("u")
    val lettersTest = "Gui"
    println("LettersTest: ${lettersTest.matches(patternLetters)}")
    println("--------------------")

    //Exercicio1:  Faça uma Regex que valide um cpf no formato nnn.nnn.nnn-nn e
    // cpnj no formato nn.nnn.nnn/nnnn-nn. +Faça os dois em uma unica expression

    // Exercicio2: Faça uma Regex que valide valores monetários,
    // por exemplo: R$ 7,50

    // Exercicio3: Faça um Regex que valide email, no padrao: email@provedor.com
    //+Validar .com ou .com.br

    //Exercicio4: Faça uma regex que valide telefone celular
    // (nn) 9nnnn-nnnn
}