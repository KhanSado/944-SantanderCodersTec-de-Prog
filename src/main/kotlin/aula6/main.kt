package aula6

fun main(){
    val autor1 = Autor("José", "1967", false)
    val autor2 = Autor("Junior", "1991", true)

    val livro1 = Livro("Titulo do livro", autor1)
    val livro2 = Romance("resumo do livro de romance aqui", "Romance", autor2)

    println(livro1.toString())
    println(livro2.toString())

}