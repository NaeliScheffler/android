package AulasAte16


interface Selvagem {
    fun atacar()

}

abstract class Mamiferos(val nome: String) {
    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("Dormi")
    }

    abstract fun falar()
}

class Cachorros(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        println("auauauau")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }
}

fun main() {

}

interface inter1
interface inter2

class Teste : inter1, inter2

