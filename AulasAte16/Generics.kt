package AulasAte16


fun main() {

    println(media(1f, 2f, 3f, 4f))

    arrayOf(1234,12,3,4,)
}

fun <T, J> mediaGenerics(abc: J, vararg notas: T): Float {

    var soma = 0f
    for (i in notas) {
        if (i is Float) {
            soma += i
        }
        if (i is String) {

        }
    }
    return soma / notas.size
}