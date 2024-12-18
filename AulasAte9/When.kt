package AulasAte9

fun main() {

}

fun bonusWhen(cargo: String): Float {
    var bonus = 0f
    when (cargo) {
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Engenheiro de software" -> bonus = 1000f
        "Estagiário" -> bonus = 500f
    }
    return bonus
}