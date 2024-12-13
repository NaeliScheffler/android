package att6

fun main() {
    var str = "aaaaa"
    var i = 0
    var x = 0
    var o = 0
    while (i <= str.length-1) {
        if (str[i] == 'x') {
            x++
        } else if (str[i] == 'o') {
            o++
        }
        i++
    }
    if (x == o && x != 0) {
        println("true")
    } else {
        println("false")
    }
}