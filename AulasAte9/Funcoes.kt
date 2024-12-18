package AulasAte9

import kotlin.math.*

fun main() {
    helloWorld()
    println("A soma de 10 e 5 é ${sum(10, 5)}")
    println(divisao(10f, 3.5f))
    val str = "Programação Kotlin."

    println("Tamanho da String: ${str.length}")
    println("Posição (index) 0 da String: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2,4))
    println(str.replace("Kotlin","Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())
    str.trim()
    println(max(5,10))
    println(min(5,10))
    println(sqrt(45.67))
    println(PI)
    println(E)
    println(round(74673.938783))

}

fun sum2(a: Int, b: Int): Int {
    return (a + b)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun helloWorld() {
    println("Hello, world")
}

fun divisao(a: Float, b: Float): Float {
    return a / b
}