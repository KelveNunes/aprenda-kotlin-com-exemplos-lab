package Main

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val 
    var listaConteudo = listOf<ConteudoEducacional>()
    val usuario = Usuario("kelve")
    val formacao = Formacao("kotlin", listaConteudo)

    formacao.matricular(usuario)
    println(formacao.inscritos)

    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
