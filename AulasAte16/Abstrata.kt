package AulasAte16

abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("Dormi")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("auauauau")
    }
}

fun main() {

}

class Funcionario() {
    fun trabalhar() {

    }
}

class Prog
class Tester
class Analyst