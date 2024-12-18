package AulasAte9

fun main() {
    val str: String? = null

    if (str == null) {
        println("nulo")
    } else {
        println(str)
    }

    println(str ?: "nulo")
}