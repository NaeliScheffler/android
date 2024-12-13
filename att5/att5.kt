package att5

fun main() {
    println("Insira um número inteiro")
    var o = readLine()!!.toInt()

    var str: String = ""

    val conc = "#"
    for (i in 0..o) {

        print("$str \n")
        str += conc

    }
}