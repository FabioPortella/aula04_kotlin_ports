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
    val c1 = Carro("Fiat", "Doblo", 1300f)
    val c2 = Carro("Volkswagem", "Fusca", 1500f)
    val c3 = Carro("Hyundai", "HB20", 1000f)
    println(c1.marca)
    println(c2.modelo)
    println(c3.ccMotor)
}

class Carro (
    var marca: String,
    var modelo: String,
    var ccMotor: Float
)