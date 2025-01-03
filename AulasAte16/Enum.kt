package AulasAte16

enum class Prioridade(val value: Int) {
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa $value"
        }
    },
    Media(5),
    Alta(5)

}

enum class AnimalEnum {
    Cachorro, Cavalo, Vaca
}

fun x(p: Prioridade) {

}

fun main() {
    for (p in Prioridade.values()) {
        if (p == Prioridade.Media)
            println(p.value)
    }

}