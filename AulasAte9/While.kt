package AulasAte9

fun main() {
    var i = 100
    var s = "Kotlin"

    while (i > 0) {
        print(i)
        i--
    }
    while (i < s.length) {
        print("${s[i]}")
        i++
    }
}