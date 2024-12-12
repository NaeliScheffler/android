package att4

fun main() {
    println("Insira um número inteiro ")
    val n1 = readLine()
    println("Insira mais um número inteiro ")
    val n2 = readLine()

    if (n1 == n2) {
        println("É um quadrado")
    } else {
        println("Não é um quadrado")
    }
}