package AulasAte9

fun main() {

    var i = 0

    while (i < 1000) {
        if (i == 50) {
            break
        }
        if (i < 50) {
            i++
            continue
        }
        print("$i")
        i++
    }
}
