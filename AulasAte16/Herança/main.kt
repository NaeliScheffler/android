package AulasAte16.Herança

open class Eletronico(var marca: String) {
    private fun ativarCorrente(){}
    fun ligar() {
        ativarCorrente()
    }
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processarDado() {}

}

fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.marca
}