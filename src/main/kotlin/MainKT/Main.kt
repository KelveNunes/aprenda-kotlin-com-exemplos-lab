package MainKT
import Annotation.MATRICULA
import Annotation.conteudos
import Annotation.formacao
import Annotation.usarios
import DataClass.ConteudoEducacional
import DataClass.Formacao
import Entites.Usuario
import Enuns.Nivel

fun main() {

    //as annotations class foram usadas para testes, ainda estou estudando sobre


    @conteudos
    var listaConteudoKotlin = mutableListOf<ConteudoEducacional>()
    val conteudoKotlinBasico = ConteudoEducacional("basico kotlin",60, Nivel.BASICO)
    val conteudosKotlinIntermediario = ConteudoEducacional("Kotlin intermediario", 100, Nivel.INTERMEDIARIO)
    listaConteudoKotlin.run{
        add(conteudoKotlinBasico)
        add(conteudosKotlinIntermediario)
    }

    @conteudos
    var listaConteudoJava = mutableListOf<ConteudoEducacional>()
    val conteudoJavaBasico = ConteudoEducacional("basico Java",60, Nivel.BASICO)
    val  conteudosJavaIntermediario = ConteudoEducacional("Java intermediario", 100, Nivel.INTERMEDIARIO)
    listaConteudoJava.run {
        add(conteudoJavaBasico)
        add(conteudosJavaIntermediario)
    }

    @conteudos
    var listaConteudoIA = mutableListOf<ConteudoEducacional>()
    val conteudoIADificil = ConteudoEducacional("IA dificil", 300, Nivel.DIFICIL)
    listaConteudoIA.run {
        add(conteudoIADificil)
    }
    @formacao
    val formacaoKotlin = Formacao("kotlin", listaConteudoKotlin )
    val formacaoJava = Formacao("java", listaConteudoJava)
    val formacaoIA = Formacao("IA", listaConteudoIA)

    @usarios
    val usuario = Usuario("kelve")
    val usuario2 = Usuario("junior")

    @MATRICULA
    formacaoKotlin.run {
        matricular(usuario)
        matricular(usuario2)
    }
    formacaoJava.apply {
        matricular(usuario)
        matricular(usuario2)
    }



    println("formação ${formacaoKotlin.nome} tem os seguintes conteudos ${formacaoKotlin.conteudos}")
    println("alunos matriculados no curso de ${formacaoKotlin.nome}")
    for(i in 0 .. 1){
        println( "${formacaoKotlin.inscritos.get(i).nome}")
    }

    println("forma")

    println("formação ${formacaoJava.nome} tem os seguintes conteudos ${formacaoJava.conteudos}")
    println("alunos matriculados no curso de ${formacaoJava.nome}")
    for(i in 0 .. 1){
        println( "${formacaoJava.inscritos.get(i).nome}")
    }

    println("formação IA${formacaoIA.nome} tem os seguintes conteudos ${formacaoIA.conteudos}")

    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
