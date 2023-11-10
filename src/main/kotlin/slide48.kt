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
//)
// código alterado pelo aluno Fábio de Abreu Portella
// Classes

fun main() {
    val c1 = Carro("Doblo", 8.5f, 90f)
    val c2 = Carro("Fusca", 9f, 50f )
    val c3 = Carro("HB20", 11f, 60f)
    println(c1.modelo)
    println(c2.consumo)
    println(c3.tanqueGasolina)
}

class Carro (
    var modelo: String,
    var consumo: Float,         // consumo em Km/l
    var tanqueGasolina: Float   // tamanho do tanque em litros
)