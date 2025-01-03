package AulasAte16

class Matematica {

    companion object {
        val PI = 3.1415926535
        fun teste() {}

        init {
            println("Fui inicializado")
        }

    }

    object obj1 {
        val PI = 3.1415926535
        fun teste() {}

        init {

        }
    }

    object obj2 {
        val PI = 3.1415926535
        fun teste() {}
    }

}

fun main() {
    Matematica.PI
    Matematica.teste()
    Matematica.obj2.PI

    val m = Matematica()

}