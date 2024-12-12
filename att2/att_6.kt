package att2

fun main() {
    println(trocasLetras("Bom dia, qual seu nome?"))
}

fun trocasLetras(str: String): String = str.replace('A', 'x').replace('a', 'x')

fun stri(string: String): String = "${string.length}"

fun milhasKms(n: Int): Double = n * 1.6

