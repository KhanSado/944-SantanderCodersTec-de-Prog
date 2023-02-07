package aula6

open class Livro {
    var titulo: String
    var autor: Autor

    constructor(titulo: String, autor: Autor){
        this.titulo = titulo
        this.autor = autor
    }

    override fun toString(): String {
        return "Titulo: ${this.titulo},   Autor: ${this.autor.nome}"
    }
}