package AulasAte16

class Animais(var especie: String) {
    var fala: String = ""
        get() {
            println("Fazendo o get no atributo fala")
            return field
        }
        set(value) {
            field = value
            println("Fazendo o set no atributo fala")
        }
}

fun main() {
   var a = Animais("Cachorro")
    a.fala ="au au"

}