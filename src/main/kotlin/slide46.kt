// código original do slide

//fun main() {
//    mensagem()
//    mensagemComParametro(1)
//    mensagemComParametro(2)
//}
//
//fun mensagem(){
//    println("Feliz Natal!")
//}
//
//fun mensagemComParametro(n: Int) {
//    if (n == 1)
//        println("Feliz Natal!")
//    else
//        println("Feliz Aniversário!")
//}

// código alterado pelo aluno Fábio de Abreu Portella
// funções, com parâmetro e sem parâmetro

fun main() {
    mensagemSemParametro()
    mensagemComParametro(2)
    mensagemComParametro(3)
}

fun mensagemSemParametro(){
    println("Bom dia")
}

fun mensagemComParametro(n: Int) {
    when (n) {
        1 -> println("Bom dia")
        2 -> println("Boa tarde")
        else -> println("Boa noite")
    }
}