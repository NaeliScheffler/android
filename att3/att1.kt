package att3

fun main() {
    println(bonus("Estagiário"))
}

fun bonus(cargo: String) {
    var bonus = 0
    if (cargo == "Gerente") {
        bonus = 2000
    } else if (cargo == "Coordenadores") {
        bonus = 1500
    } else if (cargo.equals("Engenheiro de software")) {
        bonus = 1000
    } else if (cargo.equals("Estagiário")) {
        bonus = 500
    }
    println(bonus)
}