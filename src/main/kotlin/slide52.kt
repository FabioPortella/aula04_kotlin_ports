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
//open class Pessoa (
//    var nome: String,
//    var peso: Float,
//    var altura: Float
//) {
//  val imc get() = peso / (altura * altura)
//}

// código alterado pelo aluno Fábio de Abreu Portella
// Assessores Customizados - Obs. a Classe Carro foi alterada nos slides
// posteriores ao 48 tendo em vista conflito ao usar o mesmo nome, sendo usado
// Carros (49) e neste código Veiculo

fun main() {
    val c1 = Veiculo("Doblo", 8.5f, 80f)
    val c2 = Veiculo("Fusca", 9f, 55f )
    val c3 = Veiculo("HB20", 10.5f, 60f)
    println("${c1.modelo} tem autonomia = ${c1.autonomia}")
    println("${c2.modelo} tem autonomia = ${c2.autonomia}")
    println("${c3.modelo} tem autonomia = ${c3.autonomia}")
}

open class Veiculo (
    var modelo: String,
    var consumo: Float,
    var tanqueGasolina: Float) {
    val autonomia get() = consumo * tanqueGasolina
}