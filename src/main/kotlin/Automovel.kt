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