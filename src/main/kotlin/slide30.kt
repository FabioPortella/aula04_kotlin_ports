// código original do slide

//fun main() {
//    val myText = "Hello"    // String
//    println(myText)
//    println(myText[0])
//    println(myText[1])
//    println(myText.get(0))
//    println(myText.get(1))
//    println(myText.lowercase())
//    println(myText.uppercase())
//    println(myText.length)
//    println(myText.equals("hello"))
//    println(myText == "hello")
//    println(myText.startsWith("H"))
//    println(myText.endsWith("H"))
//    println(myText.substring(0,2))
//}

// código alterado pelo aluno Fábio de Abreu Portella
// String - dado que se comporta como um vetor de caracteres

fun main() {
    val meuTexto = "Seja bem vindo"    // String
    println(meuTexto)
    println(meuTexto[0])
    println(meuTexto[1])
    println(meuTexto.get(0))
    println(meuTexto.get(1))
    println(meuTexto.lowercase())
    println(meuTexto.uppercase())
    println(meuTexto.length)
    println(meuTexto.equals("seja bem vindo"))
    println(meuTexto == "Seja bem vindo")
    println(meuTexto.startsWith("S"))
    println(meuTexto.endsWith("S"))
    println(meuTexto.substring(0,4))
}