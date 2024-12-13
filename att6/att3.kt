package att6

fun main() {
    var str = "Meu nome é Julius"
    var i = 0
    var aux = str.length -1
    while (i <= str.length -1) {
        print("${str[aux]}")
        aux--
        i++

    }
}