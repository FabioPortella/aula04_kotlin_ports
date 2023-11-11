// código original do slide já alterado
// pelo aluno Fábio de Abreu Portella
// corresponde aos slides 69 - Exceções

fun main() {
    var s: Any = "s"
    var r = 0f

    do{
        print("Digite um número inteiro ou 's' para sair:")
        try {
            s = readln()!!
            if (s == "s")
                break
            r += s.toInt()
        }
        catch (e: NumberFormatException) {
            println(" Número inválido, tente novamente")
        }
        catch (e: Exception) {
            println("Ocorreu uma exceção")
        }
        finally {
            println("Total parcial: $r")
        }
    }while (s != "s")
}