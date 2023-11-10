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