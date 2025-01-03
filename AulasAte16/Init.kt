package AulasAte16

class Animal(var especie: String) {
    var fala: String = ""

    init {
        if (especie == "Cachorro") {
            fala = "au au"
        } else if (especie == "Gato") {
            fala = "miau miau"
        } else {
            fala = "Sou um animal desconhecido"
        }


    }

    fun falar() {
        println(fala)
    }
}

fun main() {
    var animal = Animal("Cachorro")
    animal.falar()
}