// código original do slide

//fun main() {
//    var i = 0
//    while (i < 10) {
//        i++
//        if (i == 4)
//            break
//        print("$i, ")
//    }
//
//    i = 0
//
//    while (i < 10) {
//        i++
//        if (i == 4)
//            continue
//        print("$i, ")
//    }
//}

// código alterado pelo aluno Fábio de Abreu Portella
// BREAK e CONTINUE

fun main() {
    var x = 0
    while (x < 10) {
        x++
        if (x == 5)
            break
        print("$x, ")
    }

    var y = 0

    while (y < 10) {
        y++
        if (y == 6)
            continue
        print("$y, ")
    }
}