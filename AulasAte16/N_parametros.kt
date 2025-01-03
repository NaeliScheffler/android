package AulasAte16

fun main() {

    println(media(1f, 2f, 3f, 4f))
}

fun media(vararg notas: Float): Float {

    var soma = 0f
    for (i in notas) {
        soma += i
    }
    return soma / notas.size
}