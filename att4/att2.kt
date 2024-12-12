package att4

fun main() {
    println("Insira um número inteiro ")
    val n1 = readLine()
    println("Insira mais um número inteiro ")
    val n2 = readLine()
    println("Insira mais um número inteiro ")
    val n3 = readLine()

    if (n1 == n2 && n3 == n1) {
        println("É um triangulo equilátero")
    } else {
        println("Não é um triangulo equilátero")
    }
}