import br.com.fabioportella.util.Calculadora

// código original do slide já alterado
// pelo aluno Fábio de Abreu Portella
// corresponde aos slides 65 a 69
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
}

