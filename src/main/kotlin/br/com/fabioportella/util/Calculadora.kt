package br.com.fabioportella.util

class Calculadora {
    fun somar (x1: Int, x2: Int) = x1 + x2
    fun subtrair (x1: Int, x2: Int) = x1 - x2
    fun multiplicar (x1: Int, x2: Int) = x1 * x2
    // fun dividir (x1: Int, x2: Int) = x1 / x2
    fun dividir (x1: Int, x2: Int) = x1 / x2.toFloat()
    fun dividir (x1: Float, x2: Float) = x1 / x2
}