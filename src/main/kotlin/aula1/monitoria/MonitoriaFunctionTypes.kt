package aula1.monitoria

fun main() {
    // perceba que na criacao da funcao "aula1.monitoria.adicionarProfissao" invokamos a funcao por parametro
    // com o parametro "Backend"
    // e na nossa funcao de "aula1.monitoria.pegarOsDadosDeUsuario" precisamos adicioar essa informação
    // de outra API para conseguir mostrar para o usuario em uma dashboard, por exemplo

    // repare que essa chamada da funcao no parametro somente ira funcionar se as funcoes
    // tiverem as mesmas quantidades de parametros, bem como o mesmo tipo
    adicionarProfissao(::pegarOsDadosDeUsuario)
}

fun adicionarProfissao(adicionarClasse: (String) -> UsuarioFuncionario) {
    // Imagine que essa confirmacao vira de uma outra API, por exemplo do time de pessoas
    // Então eu preciso desse passo itnermediario para conseguir settar e conseguir trabalhar nosso
    // dado do usuario
    adicionarClasse("Backend")
}

private fun pegarOsDadosDeUsuario(classeDoFuncionario: String): UsuarioFuncionario {
    // imagine que aqui também iremos ter uma comunicacao com o mesmo servidor
    // mas agora vamos utilizar esse retorno para fazer mais tratamentos dentro da funcao
    // nesse exemplo, perceba que o attr "profissao" da classe aula1.monitoria.Usuario seja sempre nula
    // ao cadsatar e precisemos de um funcao intermediaria para conseguir
    // settar esse valor, e somente nosso codigo pode fazer isso
    // veja a seguinte logica:
    val funcionario = UsuarioFuncionario("Victor", 26, "1,80m")
    when (classeDoFuncionario) {
        "Backend" -> funcionario.profissao = "Desenvolvedor Backend"
        "Frontend" -> funcionario.profissao = "Desenvolvedor Frontend"
        "Mobile" -> funcionario.profissao = "Desenvolvedor Mobile"
        else -> funcionario.profissao = "Desenvolvedor"
    }

    // veja que o valor printado é de acordo com que recebemos da funcao "aula1.monitoria.adicionarProfissao"
    println(funcionario)

    return funcionario
}

data class UsuarioFuncionario(
        val nome: String,
        val idade: Int,
        val altura: String,
        var profissao: String? = null
)