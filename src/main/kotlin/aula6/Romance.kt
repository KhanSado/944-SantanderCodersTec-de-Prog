package aula6

class Romance : Livro {
    var resumo: String

    constructor(resumo: String, titulo: String, autor: Autor): super(titulo, autor) {
        this.resumo = resumo
    }

    override fun toString(): String {
        return "Titulo: ${this.titulo},   Autor: ${this.autor.nome}, Resumo: ${this.resumo}"
    }
}