package AulasAte16

open class Eletronico(var marca: String) {
    private fun ativarCorrente(ativo: Boolean) {}
    fun ligar() {
        ativarCorrente(ativo = true)
    }

    open fun desligar() {
        ativarCorrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) {
    override fun desligar() {
        save()
        super.desligar()
    }

    fun save() {}
    fun save(a: Int) {}
    fun save(a: Boolean) {}


}

fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.toString()
    c.save()
}