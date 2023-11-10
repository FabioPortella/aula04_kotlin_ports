// código original do slide

//fun main() {
//    val nota = 4
//    var resultado = when {
//        nota >= 6  -> "Aprovado"
//        nota < 4   -> "Reprovado"
//        else -> "Recuperação"
//    }
//
//    println(resultado)
//
//    val notaV2 = 4f // ou 4.toFloat()
//    resultado = when (notaV2) {
//        in 6f..10f -> "Aprovado"
//        in 4f..6f -> "Recuperação"
//        in 0f..4f -> "Reprovado"
//        else -> "INVÁLIDA"
//    }
//    println(resultado)
//
//    val estado = "RS"
//    resultado = when (estado) {
//        "AC", "AM", "RR", "AP", "PA", "RO", "TO" -> "Norte"
//        "SP", "MG", "ES", "RJ" -> "Sudeste"
//        else -> "Outra"
//    }
//    println(resultado)
//}

// código alterado pelo aluno Fábio de Abreu Portella
// usando a estrutura WHEN

fun main() {
    val nota = 7
    var resultado = when {
        nota >= 7  -> "Você foi aprovado"
        nota < 5   -> "Você foi reprovado"
        else -> "Vodê está de recuperação"
    }

    println(resultado)

    val notaV2 = 3f // ou 4.toFloat()
    resultado = when (notaV2) {
        in 7f..10f -> "Você foi aprovado"
        in 5f..7f -> "Você está de recuperação"
        in 0f..5f -> "Você foi reprovado"
        else -> "Nota inválida"
    }
    println(resultado)

        val estado = "RS"
    resultado = when (estado) {
        "AC", "AM", "RR", "AP", "PA", "RO", "TO" -> "Norte"
        "SP", "MG", "ES", "RJ" -> "Sudeste"
        "SC", "PR", "RS" -> "Sul"
        else -> "Outra"
    }
    println(resultado)
}