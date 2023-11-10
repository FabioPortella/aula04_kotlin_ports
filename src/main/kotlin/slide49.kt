// código original do slide

//fun main() {
//    val p1 = Pessoa("Maria", 60f, 1.70f)
//    val p2 = Pessoa("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa("Marcos", 80f, 1.80f)
//    println(p1.nome)
//    println(p2.nome)
//    println(p3.nome)
//}
//
//class Pessoa (
//    var nome: String,
//    var peso: Float,
//    var altura: Float
//) {
//  fun imc() = peso / (altura * altura)
//}

// código alterado pelo aluno Fábio de Abreu Portella
// Métodos

fun main() {
    val c1 = Carros("Doblo", 8.5f, 90f)
    val c2 = Carros("Fusca", 9f, 50f )
    val c3 = Carros("HB20", 11f, 60f)
    println("${c1.modelo} tem autonomia = ${c1.autonomia()}")
    println("${c2.modelo} tem autonomia = ${c2.autonomia()}")
    println("${c3.modelo} tem autonomia = ${c3.autonomia()}")
}

class Carros (
    var modelo: String,
    var consumo: Float,
    var tanqueGasolina: Float) {
    fun autonomia() = consumo * tanqueGasolina
}