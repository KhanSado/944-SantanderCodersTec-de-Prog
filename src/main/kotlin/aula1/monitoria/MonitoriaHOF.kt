package aula1.monitoria

fun main() {
    // o parametro que chamamos de "mensagem" na funcao "aula1.monitoria.aula1.monitoria.clicarBotaoParaCadastrarUsuario"
    // sera recebido pela lambda dessa chamada abaixo
    // repare que o valor que sera printado vai ser as mensagens que passamos na funcao
    // que controla a verificacao (ou seja, na criacao dessa funcao)
    clicarBotaoParaCadastrarUsuario(
            fazQuandoSucesso = { mensagemDeSucesso ->
                println(mensagemDeSucesso)
            },
            fazQuandoErro = { mensagemDeErro ->
                println(mensagemDeErro)
            }
    )
}

fun clicarBotaoParaCadastrarUsuario(
        fazQuandoSucesso: (mensagem: String) -> Unit,
        fazQuandoErro: (mensagem: String) -> Unit
) {
    // o nome da funcao é bem sugestivel, e imagine que ela sera chamada
    // quando esse botao para cadastrar for clicado
    // e entao eu posso ter uma logica complexa quando chamar essa funcao
    // vamos supor que queremos mostrar essa mensagem que passamos por parametro
    // seja mostrada para o usuario
    val cadastrarUsuario = pegarDadosDoServidor()
    if (cadastrarUsuario != null) {
        fazQuandoSucesso("Sucesso ao cadastrar")
    } else {
        fazQuandoErro("Errou. Tente novamente")
    }
}


private fun pegarDadosDoServidor(): Usuario? {
    // Imagine que aqui você irá fazer uma comunicação com uma API
    // para retornar dados de um usuário
    // repare que a funcao pode nao pegar nada e retornar null (aula1.monitoria.Usuario?)

    return Usuario("Victor", 26, "1,80m")
}

private data class Usuario(val nome: String, val idade: Int, val altura: String)