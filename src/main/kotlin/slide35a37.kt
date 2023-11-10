// código original do slide

//fun main() {
//    val nota = 4
//    if (nota >= 6)
//            println("Aprovado")
//    else if (nota < 4)
//        println("Reprovado")
//    else
//        println("Recuperação")
//}

// código alterado pelo aluno Fábio de Abreu Portella
// estrutura de decisão - IF

fun main() {
    var nota = 8
    if (nota >= 7)
        println("Você foi Aprovado")
    else if (nota < 5)
        println("Você foi Reprovado")
    else
        println("Você está de Recuperação")

    //encurtando o código
    nota = 3
    println(if (nota >=7) "Você foi aprovado"
        else if (nota < 5) "Você foi Reprovado"
        else "Você está de recuperação" )
}