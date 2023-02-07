package aula6

class Autor {
    var nome: String
    var anoNascimento: String
    var aindaEscreve: Boolean

    constructor(nome: String, anoNascimento:String, aindaEscreve: Boolean){
        this.nome = nome
        this.anoNascimento = anoNascimento
        this.aindaEscreve = aindaEscreve
    }
}