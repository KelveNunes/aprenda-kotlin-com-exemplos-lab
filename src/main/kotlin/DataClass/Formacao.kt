package DataClass

import Annotation.conteudos
import Entites.Usuario


data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()


    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}
