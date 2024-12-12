package att4

fun main() {
    val n = 4
    qualASaida(n)

}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira String")
        else println("Segunda String")
    }
    println("Terceira String")
}