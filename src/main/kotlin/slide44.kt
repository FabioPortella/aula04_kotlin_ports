// código original do slide

//fun main() {
//    var valores = arrayOf(10,20,30,50)
//    for (i in valores)
//        if (i == 20) {
//            println("O vetor contêm o buscado")
//            break
//        }
//
//    if (20 in valores)
//        println("O vetor contêm o buscado")
//}

// código alterado pelo aluno Fábio de Abreu Portella
// Pesquisa em Vetores

fun main() {
    val itens = arrayOf("Arroz", "Feijão", "Salada", "Ovo")
    for (i in itens)
        if (i == "Ovo") {
            println("O vetor ($i) foi encontrado")
            break
        }
    val i = "Frutas"
    if (i in itens)
        println("O vetor ($i) foi encontrado")
    else
        println("O vetor não foi encontrado")
}