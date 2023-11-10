// código original do slide

//fun main() {
//
//    var lista = ArrayList<String>()
//
//    lista.add("RS")
//    lista.add("MG")
//    lista.add("SP")
//    lista.add("RJ")
//    lista.sort()
//    println(lista[0])
//    lista.sortDescending()
//    println(lista[0])
//}

// código alterado pelo aluno Fábio de Abreu Portella
// Ordenação de listas

fun main() {

    var pratoDoDia = ArrayList<String>()

    pratoDoDia.add("Feijão")
    pratoDoDia.add("Arroz")
    pratoDoDia.add("Salada")
    pratoDoDia.add("Bife a milanesa")
    pratoDoDia.sort()
    println(pratoDoDia)
    println(pratoDoDia[0])
    pratoDoDia.sortDescending()
    println(pratoDoDia[0])
}