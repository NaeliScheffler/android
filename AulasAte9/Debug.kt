package AulasAte9

fun main() {
    teste()
    var s =""
    println("Qual a sua idade? ")
    val numero = readlnOrNull()?.toIntOrNull()

    if (numero != null) {
        if (numero < 18) {
            println("Negado. Menores de idade não são permitidos")
        } else {
            println("Qual o tipo de convite?")
            val tipo = readlnOrNull()
            if (tipo == "comum") {
                println("Qual o código ")
                val cod = readlnOrNull()
                if (cod != null) {
                    if (cod.startsWith("xt")) {
                        println("Welcome")
                    } else {
                        println("Acesso negado")
                    }

                }
            } else if (tipo == "premium" || tipo == "luxo") {
                println("Qual o código ")
                val cod = readlnOrNull()
                if (cod != null) {
                    if (cod.startsWith("xl")) {
                        println("Welcome")
                    } else {
                        println("Acesso negado")
                    }
                }
            }
        }
    }
}

fun teste(): String {
    return "Hello"

}