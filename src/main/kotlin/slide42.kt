// código original do slide

//fun main() {
//    var valores = arrayOf(10,20,30,50)
//    for (i in valores)
//        print("Saldo: $i, ")
//}

// código alterado pelo aluno Fábio de Abreu Portella
// FOR com IN

fun main() {
    val valores = arrayOf(10,20,30,50)
    var saldo = 0
    for (i in valores)
        saldo += i

    print("Saldo: $saldo")
}