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
//open class Pessoa (val nome: String, val peso: Float, val altura: Float) {
//  val imc get() = peso / (altura * altura)
//}
//class Cliente(var renda: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
//  fun aprovacao() = renda > 1000
//}

// Código alterado pelo aluno Fábio de Abreu Portella
// Herança e Imprimindo Objetos
// Obs: a Classe foi alterada para Automóvel para
// evitar conflitos com as classes anteriores.

fun main() {
    val c1 = Automovel("Doblo", 1300f, 8.5f, 80f)
    val c2 = Automovel("Fusca", 1200f, 9f, 55f )
    val c3 = Automovel("HB20", 1000f, 10.5f, 60f)
    val c4 = Blindado(3f,3600f,"LandRover", 3000f, 8f, 80f)
    println("${c1.modelo} tem autonomia = ${c1.autonomia}")
    println("${c2.modelo} tem autonomia = ${c2.autonomia}")
    println("${c3.modelo} tem autonomia = ${c3.autonomia}")
    println("${c4.modelo}, após blindado terá peso de ${c4.novoPeso}kg")
    println(c1)
    println(c4)
}

open class Automovel (
    var modelo: String,
    var ccMotor: Float,
    var consumo: Float,
    var tanqueGasolina: Float) {
    override fun toString(): String {
        return "$modelo, $ccMotor"
    }
    val autonomia get() = consumo * tanqueGasolina
}

class Blindado(
    var espessuraVidro: Float, // espessura do vidro blindado em mm.
    var novoPeso: Float,
    modelo: String,
    ccMotor:Float,
    consumo: Float,
    tanqueGasolina: Float
): Automovel(modelo, ccMotor, consumo, tanqueGasolina) {
    fun aprovadoParaBlindagem() = ccMotor > 2000f
}
