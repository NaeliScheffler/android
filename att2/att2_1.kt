package att2

fun main() {
    transformarAnos(2)
}

fun transformarAnos(a: Int) {
    println("Dois anos equivalem a: ")
    var meses = a * 12
    println("$meses meses")
    var dias = meses * 30
    println("$dias dias")
    var horas = dias * 24
    println("$horas horas")
    var minutos = horas * 60
    println("$minutos minutos")
    var segundos = minutos * 60
    println("$segundos segundos")
}