package att2

import java.util.*

fun main() {
    println(trocaLetras("Bom dia, qual seu nome?"))
}

fun trocaLetras(str: String): String {
    var result = str.replace('A', 'x')
    result = result.replace('a', 'x')
    result = result.lowercase(Locale.getDefault())
    return result
}