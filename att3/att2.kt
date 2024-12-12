package att3


fun main() {
    println(bonusTempo("Gerente", 5))
}

fun bonusTempo(cargo: String, tempo: Int) {
    var bonus = 0
    if (cargo == "Gerente") {
        if (tempo < 2) {
            bonus = 2000
        } else {
            bonus = 3000
        }
    } else if (cargo == "Coordenadores") {
        if (tempo < 1) {
            bonus = 1500
        } else {
            bonus = 1800
        }
    } else if (cargo.equals("Engenheiro de software")) {
        bonus = 1000
    } else if (cargo.equals("Estagiário")) {
        bonus = 500
    }
    println(bonus)
}