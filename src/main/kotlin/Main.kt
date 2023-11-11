import br.com.fabioportella.util.Calculadora

// código original do slide já alterado
// pelo aluno Fábio de Abreu Portella
// corresponde aos slides 65 a 68
fun main() {
    // referente slide 65
    println(Calculadora().somar(2, 3))

    // referente slide 67
    val b = "2"
    println(b + 1)
    println(b.toInt() + 1)
    println(b.toFloat() + 1)
    println((b.toDouble() + 1).toString())
    println((b.toDouble() + 1).toString() + 1)

    // referente slide 68 - Smart cast
    var c: Any = '1'
    var result = when (c) {
        is String -> "$c é um texto"
        is Int -> "$c é um número inteiro"
        else -> "não sei qual o tipo da variável"
    }
    println(result)
    println(c::class.simpleName)  // informa o tipo da variável
}

